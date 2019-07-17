package src.CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ccc01j2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for (int i=0; i<5; i++) {
            String a = sc.next();
            if (a.equals("P")) counter++;
        }
        System.out.println(counter);
    }
}