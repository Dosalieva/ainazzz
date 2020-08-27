package com.company;

public class Warrior extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Исчезать");
    }

    @Override
    public String superAbilityType() {
        return "Warrior применил суперспособность";
    }
}
