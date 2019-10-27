package src.AtCoder.abc142;

import java.util.Scanner;

public class abc142_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double counter = 0;
        for (int i=1; i<=N; i++) {
            if (i%2==1) {
                counter++;
            }
        }
        System.out.println(counter/N);
    }
}

