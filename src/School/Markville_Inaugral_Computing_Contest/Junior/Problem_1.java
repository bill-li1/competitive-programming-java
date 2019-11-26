package src.School.Markville_Inaugral_Computing_Contest.Junior;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N==1) {
            System.out.println("Math");
        } else if (N==2) {
            System.out.println("Science");
        } else if (N==3) {
            System.out.println("Lunch");
        } else if (N==4) {
            System.out.println("Computer Science");
        } else if (N==5) {
            System.out.println("Accounting");
        }
    }
}