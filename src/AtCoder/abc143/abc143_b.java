package src.AtCoder.abc143;

import java.util.Scanner;

public class abc143_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                sum += arr[i]*arr[j];
            }
        }
        System.out.println(sum);
    }
}