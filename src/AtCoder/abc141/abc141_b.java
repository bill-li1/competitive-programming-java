package src.AtCoder.abc141;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc141_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        for (int i=0; i<S.length(); ++i) {
            if (i%2==1 && !checkEven(S.charAt(i))) {
                System.out.println("No");
                return;
            } else if (i%2==0 && !checkOdd(S.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static boolean checkEven(char a) {
        if (a=='L' || a=='U' || a=='D') return true;
        return false;
    }
    public static boolean checkOdd(char a) {
        if (a=='R' || a=='U' || a=='D') return true;
        return false;
    }
}
