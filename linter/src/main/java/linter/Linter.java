package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Linter {

    public static void main(String[] args) {
        String returnString = linter("src/main/resources/gates.js");
        System.out.println(returnString);
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
