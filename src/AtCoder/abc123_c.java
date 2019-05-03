package AtCoder;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class abc123_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        long[] arr = new long[5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        DecimalFormat format = new DecimalFormat("0.#");
        long out = (long)(Math.floor(T/arr[0])+5);
        if (T % arr[0]==0) out--;
        System.out.println(format.format(out));
    }
}
