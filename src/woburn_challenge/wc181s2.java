package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TODO not complete yet

public class wc181s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(br.readLine());
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int length = 1;
        String out = "";
        for (int i=0; i<W; i++) {
            int a = i/26;
            int b = i%26;
            char[] word = new char[a+1];
            for (int ii=0; ii<word.length; ii++) {
               // word[ii] = letters.charAt()
            }
        }
    }
}
