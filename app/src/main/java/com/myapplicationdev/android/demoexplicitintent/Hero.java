package com.myapplicationdev.android.demoexplicitintent;

import java.io.Serializable;

public class Hero implements Serializable {

    private String name;
    private int Strength;
    private int techncialPowers;

    public Hero(String name, int strength, int techncialPowers) {
        this.name = name;
        Strength = strength;
        this.techncialPowers = techncialPowers;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }

    public int getTechncialPowers() {
        return techncialPowers;
    }
}
