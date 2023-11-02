package com.myBasketballProject;

public class Team {
    private String teamName = "";
    private int teamSize = 12;
    private Players[] players = new Players[teamSize];

    public Team(String name, int numPlayers) {
        teamName = name;
        teamSize = numPlayers;
    }

    public String getName() {
        return teamName;
    }
}
