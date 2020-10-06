package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Maps {
    public String missingTemps(int[][] inputArray) {
        int high = inputArray[0][0];
        int low = inputArray[0][0];
        HashSet<Integer> temps = new HashSet<>();

        for (int[] ints : inputArray) {
            for (int anInt : ints) {
                temps.add(anInt);
                if (anInt > high) {
                    high = anInt;
                } else if (anInt < low) {
                    low = anInt;
                }
            }
        }
        StringBuilder returnString = new StringBuilder("High: " + high + "\nLow: " + low);

        for(int k = low; k < high; k++) {
            if(!temps.contains(k)) {
                returnString.append("\nNever saw temperature: ").append(k);
            }
        }
        return returnString.toString();
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
