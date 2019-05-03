package AtCoder;

import java.util.Arrays;
import java.util.Scanner;

public class abc123_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        if (arr[4]-arr[0]>k) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
