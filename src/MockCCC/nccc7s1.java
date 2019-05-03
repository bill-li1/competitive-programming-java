package MockCCC;

import java.util.Scanner;

public class nccc7s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextInt();
        System.out.printf("%.1f",(Y/2)*X);
        System.out.println();
    }
}

//not full marks
//does not work for cases greater than 10^9