package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wc182s1 {
    public static void main(String[] args) {
        fastreader sc = new fastreader(System.in);
        int bottom = 0;
        int left = 0;
        int top = 999999;
        int right = 999999;
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            if (a<c1 && a>left) {
                left = a;
            } else if (a>c1 && a<right) {
                right = a;
            }
        }
        for (int i=0; i<M; i++) {
            int a = sc.nextInt();
            if (a<c2 && a>bottom) {
                bottom = a;
            } else if (a>c2 && a<top) {
                top = a;
            }
        }
        int counter = 0;
        for (int i=0; i<C; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b<top && b>bottom && a<right && a>left) {
                System.out.println("Y");
                continue;
            }
            System.out.println("N");
        }
        // System.out.println(top + " " + bottom + " " + left + " " + right);
    }
    static class fastreader {
        BufferedReader br;
        StringTokenizer st;

        public fastreader(InputStream x) {
            br = new BufferedReader(new
                    InputStreamReader(x));

        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
