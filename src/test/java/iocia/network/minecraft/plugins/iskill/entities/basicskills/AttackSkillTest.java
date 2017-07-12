package iocia.network.minecraft.plugins.iskill.entities.basicskills;

import iocia.network.minecraft.plugins.iskill.entities.Skill;
import org.junit.Assert;
import org.junit.Test;

public class AttackSkillTest {

    @Test
    public void getIdTest() {
        int expectedInt = 1;
        Skill<Integer> skillInt = new AttackSkill.Builder<Integer>(1, "Attack").build();

        String expectedString = "skill_attack";
        Skill<String> skillString = new AttackSkill.Builder<String>("skill_attack", "Attack").build();

        Assert.assertEquals(expectedInt, (int) skillInt.getId());
        Assert.assertEquals(expectedString, skillString.getId());
    }

}