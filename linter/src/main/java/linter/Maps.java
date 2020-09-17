package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Maps {

    public static void main(String[] args) {
        String returnString = linter("src/main/resources/gates.js");
        System.out.println(returnString);
    }

    public String missingTemps(int[][] inputArray) {
        int high = inputArray[0][0];
        int low = inputArray[0][0];
        HashSet<Integer> temps = new HashSet<>();

        for(int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < inputArray[i].length; j++) {
                temps.add(inputArray[i][j]);
                if(inputArray[i][j] > high) {
                    high = inputArray[i][j];
                } else if(inputArray[i][j] < low) {
                    low = inputArray[i][j];
                }
            }
        }
        String returnString = "High: " + high + "\nLow: " + low;

        for(int k = low; k < high; k++) {
            if(!temps.contains(k)) {
                returnString  = returnString + "\nNever saw temperature: " + k;
            }
        }
        return returnString;
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

    public static String linter(String filePath) {
        Scanner file;
        try {
            file = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            return "Could not find the file";
        }

        int counter = 0;
        String errorString = "";
        while(file.hasNextLine()) {
            counter++;
            String temp = file.nextLine();
            if(!temp.isBlank()) {
                char endChar = temp.charAt(temp.length() - 1);
                if(!(endChar == ';' || endChar == '{' || endChar == '}' || temp.contains("if") || temp.contains("else"))) {
                    if(errorString.isBlank()) {
                        errorString = "Line " + counter + ": Missing semicolon.";
                    } else {
                        errorString = errorString + "\nLine " + counter + ": Missing semicolon.";
                    }
                }
            }
        }
        return errorString;
    }
}
