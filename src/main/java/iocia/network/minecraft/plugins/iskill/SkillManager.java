package iocia.network.minecraft.plugins.iskill;

import iocia.network.minecraft.plugins.iskill.entities.player.SkillSet;
import iocia.network.minecraft.plugins.iskill.entities.skill.Skill;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Responsible for maintaining a master collection of all
 * registered skills so all the skill data may be accessed
 * from a central point.
 */
public class SkillManager<T> {

    /*---Data---*/
    private boolean committed = false;
    private Map<T, Skill> registeredSkills = new HashMap<>();
    private Map<UUID, SkillSet<T>> playerSkillSet = new HashMap<>();

    /*---Constructors---*/
    public SkillManager() {

    }

    /*---Methods---*/
    public void registerSkill(T id, Skill skill) throws IllegalArgumentException {
        if (committed)
            throw new IllegalStateException("Skill manager has been committed. No new skills may be registered.");
        if (registeredSkills.containsKey(id))
            throw new IllegalArgumentException("A skill has already been registered with the given ID");
        registeredSkills.put(id, skill);
    }

}
