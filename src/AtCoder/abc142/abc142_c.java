package src.AtCoder.abc142;

import java.util.Scanner;

public class abc142_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1], ans = new int[N+1];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            ans[A[i]] = i+1;
        }
        for (int i=1; i<=N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}