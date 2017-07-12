package iocia.network.minecraft.plugins.iskill.entities.basicskills;

import iocia.network.minecraft.plugins.iskill.entities.BaseSkill;

abstract class BasicSkill<T> extends BaseSkill<T> {

    /*---Data---*/
    private static final int level = 200;

    /*---Constructors---*/
    BasicSkill(T id, String displayName) {
        super(id, displayName);
    }

    /*---Methods---*/
    public int getMaxLevel() {
        return level;
    }

    public int convertXpToLevel(long xp) {
        return 0;
    }

}
