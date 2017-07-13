package iocia.network.minecraft.plugins.iskill;

import iocia.network.minecraft.plugins.iskill.entities.skill.Skill;

import java.util.HashMap;
import java.util.Map;

/**
 * Responsible for maintaining a master collection of all
 * registered skills so all the skill data may be accessed
 * from a central point.
 */
public class SkillManager<T> {

    /*---Data---*/
    private Map<T, Skill> registeredSkill = new HashMap<T, Skill>();

    /*---Constructors---*/
    public SkillManager() {

    }

    /*---Methods---*/
    public void registerSkill(T id, Skill skill) throws IllegalArgumentException {
        if (registeredSkill.containsKey(id))
            throw new IllegalArgumentException("A skill has already been registered with the given ID");
        registeredSkill.put(id, skill);
    }

}
