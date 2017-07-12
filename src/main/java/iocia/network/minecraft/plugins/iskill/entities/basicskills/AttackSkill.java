package iocia.network.minecraft.plugins.iskill.entities.basicskills;

import iocia.network.minecraft.plugins.iskill.ISkillMain;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class AttackSkill<T> extends BasicSkill<T> implements Listener {

    /*---Data---*/
    private static final ISkillMain mainInstance = ISkillMain.getMain();

    /*---Constructors---*/
    private AttackSkill(Builder<T> builder) {
        super(builder.id, builder.displayName);
        if (builder.eventsEnabled)
            mainInstance.getServer().getPluginManager().registerEvents(this, mainInstance);
    }

    /*---Methods---*/
    @EventHandler
    public void onKill(EntityDeathEvent event) {
        if (event.getEntity().getKiller() == null)
            return;
        Player killer = event.getEntity().getKiller();
        killer.sendMessage("How rude!");
    }

    /*---Builders---*/
    public static class Builder<TKey> {
        private final TKey id;
        private final String displayName;
        private boolean eventsEnabled  = false;

        public Builder(TKey id, String displayName) {
            this.id = id;
            this.displayName = displayName;
        }

        public Builder<TKey> enableEvents() {
            eventsEnabled = true;
            return this;
        }

        public AttackSkill<TKey> build() {
            return new AttackSkill<TKey>(this);
        }
    }

}
