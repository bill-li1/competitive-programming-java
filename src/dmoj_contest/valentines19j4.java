package dmoj_contest;

import java.util.Arrays;
import java.util.Scanner;

public class valentines19j4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[][] map = new boolean[305][305];
        for (int i=0; i<305; i++) {
            Arrays.fill(map[i], true);
        }
        int[] multiply = new int[1005];
        int[] plus = new int[1005];
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            multiply[i] = a;
            plus[i] = b;
        }
        for (int i=0; i<M; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            map[a][b] = false;
            map[b][a] = false;
        }
        int max = 0;
        for (int a=0; a<N; a++) {
            for (int b=0; b<N; b++) {
                for (int c=0; c<N; c++) {
                    int sum = 0;
                    if (a!=b && a!=c && b!=c) {
                        sum *= multiply[a];
                        sum += plus[a];
                        sum *= multiply[b];
                        sum += plus[b];
                        sum *= multiply[c];
                        sum += plus[c];
                    }
                    if (a==b && a==c && b==c) {
                        sum *= multiply[a];
                        sum += plus[a];
                    }
                    if (a==b && a!=c && b!=c) {
                        sum *= multiply[a];
                        sum += plus[a];
                        sum *= multiply[c];
                        sum += plus[c];
                    }
                    if (a==c && b!=c && a!=b) {
                        sum *= multiply[a];
                        sum += plus[a];
                        sum *= multiply[b];
                        sum += plus[b];
                    }
                    if (b==c && a!=c && a!=b) {
                        sum *= multiply[a];
                        sum += plus[a];
                        sum *= multiply[b];
                        sum += plus[b];
                    }
                    if (sum>max && map[a][b] && map[a][c] && map[b][c]) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
