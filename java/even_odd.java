// Write a function in Java to check if a number is even or odd.
public class EvenOdd {

    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
    }
}

