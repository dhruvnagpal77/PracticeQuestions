package fizzbuzz_leetcode;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        int n = 5;
        Solution obj = new Solution();
        List<String> output = obj.fizzBuzz(n);
        System.out.println(output);
    }
}