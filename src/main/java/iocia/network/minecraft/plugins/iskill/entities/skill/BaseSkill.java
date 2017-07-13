package iocia.network.minecraft.plugins.iskill.entities.skill;

public abstract class BaseSkill<T> implements Skill<T> {

    /*---Data---*/
    private final String displayName;

    /*---Constructors---*/
    public BaseSkill(String displayName) {
        this.displayName = displayName;
    }

    /*---Methods---*/

    public String getDisplayName() {
        return displayName;
    }

}
