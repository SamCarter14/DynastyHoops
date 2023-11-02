package com.myBasketballProject;

import java.util.Scanner;

public class Game {
    private int teamNumber;
    Scanner scanner = new Scanner(System.in);
    String[] teamNamesWest = {
            "Dallas Mavericks", "Denver Nuggets", "Golden State Warriors", "Houston Rockets",
            "LA Clippers", "Los Angeles Lakers", "Memphis Grizzlies", "Minnesota Timberwolves",
            "New Orleans Pelicans", "Oklahoma City Thunder", "Phoenix Suns", "Portland Trail Blazers",
            "Sacramento Kings", "San Antonio Spurs", "Utah Jazz"
    };
    String[] teamNamesEast = {
            "Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets", "Chicago Bulls",
            "Cleveland Cavaliers", "Detroit Pistons", "Indiana Pacers", "Miami Heat", "Milwaukee Bucks",
            "New York Knicks", "Orlando Magic", "Philadelphia 76ers", "Toronto Raptors", "Washington Wizards"
    };
    private String myName = "";
    private String myTeam = "";
    Team team1 = new Team("hello", 10);

    public void startCareer() {
        System.out.println("***************************************************");
        System.out.println("*                                                 *");
        System.out.println("*       Hello and Welcome to Dynasty Hoops!       *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
        System.out.println("\nPress any button to continue...");
        scanner.nextLine();
        System.out.println("*                 Enter your name!                *");
        myName = scanner.nextLine();
        while (myName == "") {
            System.out.println("*                 Enter your name!                *");
            myName = scanner.nextLine();
        }
        System.out.println("Fantastic! It's a pleasure to meet you, " + myName + ".");
        System.out.println("What team would you like to choose? (Enter as int)");

        displayAllteams();

        System.out.println((31) + ". " + "Random Team will be selected for you.");

        do {
            System.out.print("Enter a number between 1 and 31: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
                System.out.print("Enter a number between 1 and 31: ");
            }
            teamNumber = scanner.nextInt();
        } while (teamNumber < 1 || teamNumber > 31);

    }

    public void displayGameScreen() {

    }

    public void displayAllteams() {
        int maxNameLength = 25; // Adjust this width based on the maximum team name length

        System.out.printf("%-" + maxNameLength + "s\t\t%-" + maxNameLength + "s%n", "Western Conference",
                "Eastern Conference");

        for (int i = 0; i < teamNamesWest.length && i < teamNamesEast.length; i++) {
            String westTeam = (i + 1) + ". " + teamNamesWest[i];
            String eastTeam = (i + 16) + ". " + teamNamesEast[i];

            System.out.printf("%-" + maxNameLength + "s\t\t%-" + maxNameLength + "s%n", westTeam, eastTeam);
        }
    }
}
