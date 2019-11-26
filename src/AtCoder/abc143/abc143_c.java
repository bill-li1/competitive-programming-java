package src.AtCoder.abc143;

import java.util.Scanner;

public class abc143_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int out = 1;
        String slime = sc.next();
        for (int i=0; i<A-1; i++) {
            if (slime.charAt(i)!=slime.charAt(i+1)) {
                out++;
            }
        }
        System.out.println(out);
    }
}