package com.company;

public class Medic extends Hero implements HavingSuperAbility {
    @Override
    public void applySuperAbility() {
        System.out.println("Лечить на расстоянии");
    }

    @Override
    public String superAbilityType() {
        return "Medic применил суперспособность";
    }
}
