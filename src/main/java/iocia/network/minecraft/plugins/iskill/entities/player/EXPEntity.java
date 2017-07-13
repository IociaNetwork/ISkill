package iocia.network.minecraft.plugins.iskill.entities.player;

public class EXPEntity {

    /*---Data---*/
    private long experiencePoints;

    /*---Constructors---*/
    public EXPEntity(long initialExp) {
        if (initialExp < 0)
            throw new IllegalArgumentException("EXPEntity cannot be instantiated with a negative experience level.");
        experiencePoints = initialExp;
    }

    public EXPEntity() {
        this(0);
    }

    /*---Methods---*/
    public void reset() {
        experiencePoints = 0;
    }

    public long getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(long newValue) {
        if (newValue < 0)
            throw new IllegalArgumentException("Experience value cannot be negative.");
        experiencePoints = newValue;
    }

    public void addExperiencePoints(long amountToAdd) throws ArithmeticException {
        experiencePoints = Math.addExact(experiencePoints, amountToAdd);
    }

}
