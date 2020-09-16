package basiclibrary;

import java.util.Arrays;

public class RollingDice {
    public int[] roll(int n) {
        int[] outputArray = new int[n];
        int min = 1;
        int max = 6;
        for (int i = 0; i < outputArray.length; i++) {
            double random_number = Math.random() * (max - min) + min;

            if (random_number < 1.5) {
                outputArray[i] = 1;
            } else if (random_number >= 1.5 && random_number < 2.5) {
                outputArray[i] = 2;
            } else if (random_number >= 2.5 && random_number < 3.5) {
                outputArray[i] = 3;
            } else if (random_number >= 3.5 && random_number < 4.5) {
                outputArray[i] = 4;
            } else if (random_number >= 4.5 && random_number < 5.5) {
                outputArray[i] = 5;
            } else if (random_number >= 5.5 && random_number < 6) {
                outputArray[i] = 6;
            }
        }
        return outputArray;
    }
}
