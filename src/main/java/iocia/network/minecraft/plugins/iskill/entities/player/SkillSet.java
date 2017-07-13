package iocia.network.minecraft.plugins.iskill.entities.player;

import java.util.HashMap;
import java.util.Map;

public class SkillSet<T> {

    /*---Data---*/
    private final Map<T, EXPEntity> skills;

    /*---Constructors---*/
    private SkillSet(Map<T, EXPEntity> skills) {
        this.skills = skills;
    }

    /*---Methods---*/
    public EXPEntity get(T id) {
        return skills.get(id);
    }

    /*---Builder---*/
    public static class Builder<TKey> {
        private Map<TKey, EXPEntity> skills = new HashMap<>();

        public Builder addSkill(TKey skillId, EXPEntity entity) {
            if (skills.containsKey(skillId))
                throw new IllegalArgumentException("A skill with the same Id has already been added to the skill set");
            skills.put(skillId, entity);
            return this;
        }

        public SkillSet build() {
            return new SkillSet<>(skills);
        }
    }
}
