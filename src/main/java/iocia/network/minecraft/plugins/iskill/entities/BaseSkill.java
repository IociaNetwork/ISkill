package iocia.network.minecraft.plugins.iskill.entities;

public abstract class BaseSkill<T> implements Skill<T> {

    /*---Data---*/
    private final T id;
    private final String displayName;

    /*---Constructors---*/
    public BaseSkill(T Id, String displayName) {
        this.id = Id;
        this.displayName = displayName;
    }

    /*---Methods---*/
    public T getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

}
