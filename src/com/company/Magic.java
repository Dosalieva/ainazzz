package com.company;

public class Magic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Стрелять из огня");
    }

    @Override
    public String superAbilityType() {
        return "Magic применил суперспособность";
    }
}
