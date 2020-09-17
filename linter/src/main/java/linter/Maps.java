package linter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Maps {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public String missingTemps(int[][] inputArray) {
        HashSet<String> temps = new HashSet<>();
        return "High: 72";
    }

    public String tally(List<String> votes) {
        int count;
        HashMap<String, Integer> amountTally = new HashMap<>();
        for(String vote : votes) {
            if (amountTally.containsKey(vote)) {
                count = amountTally.get(vote);
            } else {
                count = 0;
            }
            amountTally.put(vote, count + 1);
        }

        int mostVotes = 0;
        String winner = "No one";
        for(String plant : amountTally.keySet()) {
            if(amountTally.get(plant) > mostVotes) {
                winner = plant + " received the most votes!";
                mostVotes = amountTally.get(plant);
            }
        }
        return winner;
    }

    


}
