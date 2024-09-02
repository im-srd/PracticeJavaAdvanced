// Question : Given an integer n, return the least number of perfect square numbers that sum to n.
//A perfect square is an integer that is the square of an integer; in other words,
// it is the product of some integer with itself. For example, 1, 4, 9, and 16 are
// perfect squares while 3 and 11 are not.

import java.util.ArrayList;
import java.util.List;

public class PerfectSquare {
    public static boolean isPerS(int n) {
        // Check if n is a perfect square
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }

    public static int numSquares(int n) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPerS(i)) {
                num.add(i);
            }
        }
        return num.size(); // Return the number of perfect squares
    }

    public static void main(String[] args) {
        int n = 12;
        int result = numSquares(n);
        System.out.println("The least number of perfect square numbers that sum to " + n + ": " + result);
    }
}
