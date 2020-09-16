package basiclibrary;

public class ContainsDuplicates {
    public boolean containsDuplicates(int[] thingsToCheck) {
        for (int i = 0; i < thingsToCheck.length; i++) {
            for (int j = i + 1; j < thingsToCheck.length; j++) {
                if(thingsToCheck[j] == thingsToCheck[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
