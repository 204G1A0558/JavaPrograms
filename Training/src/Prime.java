import java.util.Scanner;

public class Prime {
    static void checkPrime(int n) {


        int m = 0, flag = 0;
        //n = 3;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + "is prime");
            }
        }
    }

    public static void main(String[] args) {
        checkPrime(1);
        checkPrime(88);
        checkPrime(55);
    }
}
