package dmoj_contest;

import java.util.Scanner;

public class valentines19j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        for (int i=0; i<N; i++) {
            int R = sc.nextInt();
            int G = sc.nextInt();
            int B = sc.nextInt();
            if (R>=240 && R<=255 && G>=0 && G<=200 && B>=95 && B<=220) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
