package com.myBasketballProject;

public class People {
    private String name = "";
    private int maxPotential = 1;
    private int currentPotential = 0;

    public People(String newName, int maxPotentialSetting) {
        name = newName;
        maxPotential = maxPotentialSetting;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public int getMaxPotential() {
        return maxPotential;
    }

    public int getCurrentPotential() {
        return currentPotential;
    }
}
