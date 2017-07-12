package iocia.network.minecraft.plugins.iskill;

import org.apache.commons.lang.NullArgumentException;
import org.bukkit.plugin.java.JavaPlugin;

public class ISkillMain extends JavaPlugin {

    /*---Data---*/
    private static ISkillMain instance = null;

    /*---Constructor---*/
    public ISkillMain() {

    }

    /*---Methods---*/
    @Override
    public void onEnable() {
        if (instance == null)
            instance = this;
    }

    @Override
    public void onDisable() {

    }

    /**
     * Gets the instance of the {@link ISkillMain} class.
     * @return Instance of {@link ISkillMain} class.
     * @throws NullArgumentException Thrown when the {@link ISkillMain} instance
     * is null. This should almost never, and if it does happen, try a server
     * restart, or make sure depending plugins are being initialized after
     * this plugin.
     */
    public static ISkillMain getMain() throws NullArgumentException {
        if (instance != null)
            return instance;
        throw new NullArgumentException("ISkill main instance is null!");
    }

}
