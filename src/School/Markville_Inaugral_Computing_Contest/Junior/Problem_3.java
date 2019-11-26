package src.School.Markville_Inaugral_Computing_Contest.Junior;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = " abcdefghijklmnopqrstuvwxyz";
        String S = sc.next();
        for (int i=0; i<S.length(); i++) {
            int num = A.indexOf(S.charAt(i));
            String bin = Integer.toBinaryString(num);
            int out = 0;
            for (int j=0; j<bin.length(); j++) {
                if (bin.charAt(j)=='1') {
                    out++;
                }
            }
            System.out.println(out);
        }
    }
}
