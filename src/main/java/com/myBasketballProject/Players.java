package com.myBasketballProject;

public class Players extends People {
    private int position = 0;
    private int shootingSkill = 0;
    private int athleticismSkill = 0;
    private int blockingSkill = 0;
    private int stealSkill = 0;
    private int dribblingSkill = 0;
    private int shootingPotential = 0;
    private int athleticismPotential = 0;
    private int blockingPotential = 0;
    private int stealPotential = 0;
    private int dribblingPotential = 0;
    private int jerseyNumber = 0;
    private String[] positionNames = { "Invalid Position", "Point Guard", "Shooting Guard", "Small Forward",
            "Power Forward", "Center" };

    public void player(int truePotential, int positionNumber) {
        changeMaxPotential(truePotential);
        position = positionNumber;
    }

    public void changeCurrentSkill(int shooting, int athleticism, int steal, int block, int dribbling) {
        int newSkillLevel = shooting + athleticism + steal + block + dribbling;
        changeCurrentSkill(newSkillLevel);
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
    }

}
