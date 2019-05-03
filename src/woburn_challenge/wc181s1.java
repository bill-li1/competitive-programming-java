package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//TODO fix tle

public class wc181s1 {
    public static void main(String[] args) {
        fastreader sc = new fastreader(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[][] map = new int[R][C];
        LinkedList<Integer> rowq = new LinkedList<>();
        LinkedList<Integer> colq = new LinkedList<>();
        for (int r=0; r<R; r++) {
            for (int c=0; c<C; c++) {
                int a = sc.nextInt();
                map[r][c] = a;
                if (a==2) {
                    rowq.add(r);
                    colq.add(c);
                }
            }
        }
        //System.out.println(rowq);
        //System.out.println(colq);
        int counter = 0;
        while (!rowq.isEmpty()) {
            int row = rowq.pop();
            int col = colq.pop();
            int temp = row;
            int count = 0;
            while (temp>=0 && temp>=row-K) {
                if (map[temp][col]==1) {
                    counter++;
                    break;
                }
                temp--;
            }
        }
        System.out.println(counter);
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
