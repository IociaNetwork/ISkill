package iocia.network.minecraft.plugins.iskill.entities.skill;

public interface Skill {

    /**
     * Gets the display name of the skill. This is a user-friendly name
     * which the end player will see.
     * @return Display name of the skill.
     */
    String getDisplayName();

    /**
     * Gets the highest functional level of the skill. Although it
     * may be possible for a skill to have a higher level
     * depending on its xp curve, {@link Skill#getMaxLevel()} will
     * only return the level for the highest functional level. This means
     * once a player achieves this level, there is no more functional
     * content.
     * @return Highest functional level of the skill.
     */
    int getMaxLevel();

    /**
     * Converts the given <code>xp</code> number into a level. This level could be different
     * for various skills even with the same <code>xp</code> depending on the level curve
     * the skill has implemented.
     * @param xp Number of <code>xp</code> points to convert.
     * @return <code>Integer</code> value of the level the given <code>xp</code>
     * represents for the skill.
     */
    int convertXpToLevel(long xp);

}
