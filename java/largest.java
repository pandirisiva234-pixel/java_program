// Write a function to find the largest of three numbers.
public class LargestOfThree {

    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Largest is: " + largest(10, 25, 15));
    }
}
