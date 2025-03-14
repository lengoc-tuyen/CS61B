import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i : L) {
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> res = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                res.add(i);
            }
        }
        return res;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> L = new ArrayList<>();
        for (int i : L1) {
            if (L2.contains(i))
                L.add(i);
        }
        return L;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            int l = word.length();
            for (int i = 0; i < l; i++) {
                char ch = word.charAt(i);
                if (ch == c)
                    count++;
            }

        }
        return count;
    }
}
