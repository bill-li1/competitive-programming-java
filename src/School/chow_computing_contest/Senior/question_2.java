package src.School.chow_computing_contest.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question_2 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean left = true;
        boolean[][] map = new boolean[N][M];
        for (int i=0; i<N; i++) {
            int s = sc.nextInt();
            String binary = Integer.toBinaryString(s);
            for (int j=0; j<binary.length(); j++) {
                if (binary.charAt(j)=='0') {
                    map[i][j] = true;
                }
            }
        }
        int lastx = 0;
        int lasty = 0;
        int x = M-2;
        lastx = M-1;
        lasty = N-1;
        for (int i = N-2; i>0; i--) {
            if (map[i][x]) {
                if (left && x==0) {
                    System.out.println(lastx + " " + lasty);
                    return;
                } else if (x==M-1) {
                    System.out.println(lastx + " " + lasty);
                    return;
                } else if (left) {
                    x--;
                } else {
                    x++;
                }
            } else {
                if (left) {
                    left = false;
                    x++;
                    lastx = x;
                    lasty = i;
                } else {
                    left = true;
                    x--;
                    lastx = x;
                    lasty = i;
                }
            }
        }
        System.out.println(lastx + " " + (lasty-1));
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream x) {
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
