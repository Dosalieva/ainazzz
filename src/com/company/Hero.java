package com.company;

public class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String SuperPower;

    @Override
    public void applySuperAbility() {
        System.out.println("Летать");
    }

    @Override
    public String superAbilityType() {
        return "Герой применил суперспособность";
    }



}

