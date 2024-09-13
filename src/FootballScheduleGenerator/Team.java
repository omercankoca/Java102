package FootballScheduleGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private ArrayList<String> teams;

    public Team(ArrayList<String> teams) {
        this.teams = teams;

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

    }
    public void generateFixture() {

        int numberOfRounds = (teams.size() - 1) * 2;
        int numberOfMatchesPerRound = teams.size() / 2;
        ArrayList<String> tempTeams = new ArrayList<>(teams);

        for (int round = 0; round < numberOfRounds; round++) {
            System.out.println("Round " + (round + 1));

            for (int match = 0; match < numberOfMatchesPerRound; match++) {

                int home = match;
                int away = tempTeams.size() - 1 -match;

                if (round < numberOfRounds / 2){
                    System.out.println(tempTeams.get(home) + " vs " + tempTeams.get(away));
                } else if (round > numberOfRounds / 2) {
                    System.out.println(tempTeams.get(away) + " vs " + tempTeams.get(home));
                }
            }

            Collections.rotate(tempTeams.subList(1, tempTeams.size()), 1);
            System.out.println();
        }

    }
}