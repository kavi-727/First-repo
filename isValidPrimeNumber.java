import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int l = n / 2;
        int r;
        if (n % 2 == 0) {
            r = n / 2;
        } else {
            r = n / 2 + 1;
        }
        System.out.println("The given number is sum of two prime number : " + find(n, l, r));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean find(int n, int l, int r) {
        if (l < 2) {
            return false;
        }

        if (isPrime(l) && isPrime(r)) {
            return true;
        } else {
            return find(n, l - 1, r + 1);
        }
    }
}
