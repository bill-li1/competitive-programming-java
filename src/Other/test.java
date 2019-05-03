package Other;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replaceAll("\\s+","");
        S = S.replaceAll("a","");
        S = S.replaceAll("b","");
        S = S.replaceAll("c","");
        S = S.replaceAll("d","");
        S = S.replaceAll("f","");
        S = S.replaceAll("g","");
        S = S.replaceAll("h","");
        S = S.replaceAll("i","");
        S = S.replaceAll("j","");
        S = S.replaceAll("k","");
        S = S.replaceAll("m","");
        S = S.replaceAll("n","");
        S = S.replaceAll("p","");
        S = S.replaceAll("q","");
        S = S.replaceAll("r","");
        S = S.replaceAll("s","");
        S = S.replaceAll("t","");
        S = S.replaceAll("u","");
        S = S.replaceAll("w","");
        S = S.replaceAll("x","");
        S = S.replaceAll("y","");
        S = S.replaceAll("z","");
        int counter = 0;
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i)=='l') {
                for (int ii=i; ii<S.length(); ii++) {
                    if (S.charAt(ii)=='o') {
                        for (int j=ii; j<S.length(); j++) {
                            if (S.charAt(j)=='v') {
                                for (int jj=j; jj<S.length(); jj++) {
                                    if (S.charAt(jj)=='e') {
                                        counter++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
