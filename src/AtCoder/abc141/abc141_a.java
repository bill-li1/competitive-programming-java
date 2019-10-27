package src.AtCoder.abc141;

import java.util.Scanner;

public class abc141_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.equals("Sunny")) System.out.println("Cloudy");
        if (S.equals("Cloudy")) System.out.println("Rainy");
        if (S.equals("Rainy")) System.out.println("Sunny");
    }
}
