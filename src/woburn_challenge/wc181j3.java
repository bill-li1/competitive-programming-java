package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wc181j3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char a = convert(Integer.parseInt(st.nextToken()));
        char b = convert(Integer.parseInt(st.nextToken()));
        if (a==b) System.out.println("Same");
        else System.out.println("Different");

    }
    public static char convert (int a) {
        if (a>=90) return 'A';
        else if (a>=80) return 'B';
        else if (a>=70) return 'C';
        else if (a>=60) return 'D';
        else return 'F';
    }
}
