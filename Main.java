import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i=0; i<62; i++) {
            total += sc.nextDouble();
        }
        System.out.println(total);
    }
}