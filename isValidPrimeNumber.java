import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 23;
        int l = n / 2;
        int r;
        if (n % 2 == 0) {
            r = n / 2;
        } else {
            r = n / 2 + 1;
        }
        System.out.println(find(n, l, r));
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
