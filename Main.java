import java.util.Scanner;

public class Main {

    public static boolean isPrime(int N) {
        for (int i=2; i<=Math.sqrt(N); i++) {
            if (N%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<100; i++) {
            System.out.println(isPrime(i) + " " + i);
        }
    }
}
