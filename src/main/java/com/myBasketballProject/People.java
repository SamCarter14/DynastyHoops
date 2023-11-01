package com.myBasketballProject;

public class People {
    private String name = "";
    private int maxPotential = 1;
    private int currentSkill = 0;
    private int age = 20;

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

    public void changeMaxPotential(int truePotential) {
        maxPotential = truePotential;
    }

    public int getCurrentSkill() {
        return currentSkill;
    }

    public void changeCurrentSkill(int newSkillLevel) {
        currentSkill = newSkillLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
