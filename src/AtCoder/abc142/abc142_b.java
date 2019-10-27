package src.AtCoder.abc142;

import java.util.Scanner;

public class abc142_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int counter = 0;
        for (int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if (temp >= M) counter++;
        }
        System.out.println(counter);
    }
}
