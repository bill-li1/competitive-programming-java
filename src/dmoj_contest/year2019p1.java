package dmoj_contest;

import java.util.Scanner;

public class year2019p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()-1;
        int a1 = sc.nextInt();
        int b = sc.nextInt()-1;
        int b1 = sc.nextInt();
        if (a*b1 > b*a1) {
            System.out.println(1);
        }
        else if (a*b1 < b*a1) {
            System.out.println(2);
        }
        else System.out.println(-1);
    }
}
