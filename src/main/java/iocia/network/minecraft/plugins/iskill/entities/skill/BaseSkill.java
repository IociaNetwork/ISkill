package iocia.network.minecraft.plugins.iskill.entities.skill;

public abstract class BaseSkill implements Skill {

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
