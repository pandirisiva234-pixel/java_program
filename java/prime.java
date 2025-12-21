//Write a function to check if a given number is prime.
public class PrimeCheck {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(7)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}
