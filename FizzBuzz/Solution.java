package FizzBuzz;
import java.util.*;
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ls.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ls.add("Fizz");
            } else if (i % 5 == 0) {
                ls.add("Buzz");
            } else {
                ls.add(Integer.toString(i));
            }

        }
        return ls;
    }
}
