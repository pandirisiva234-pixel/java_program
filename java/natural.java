// Write a function to calculate the sum of first N natural numbers.
public class SumOfN {

    static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: " + sum(5));
    }
}

