package FootballScheduleGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> teams = new ArrayList<>();
        System.out.println("How many teams will compete?");
        int teamNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the teams names:");
        for(int i = 0; i < teamNumber; i++) {
            teams.add(scanner.nextLine());
        }

        Team teamRounds = new Team(teams);
        teamRounds.generateFixture();
        scanner.close();
    }
    }

