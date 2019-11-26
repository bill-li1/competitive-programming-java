package src.School.Markville_Inaugral_Computing_Contest.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        int tt = 0;
        int maxp = 0;
        int taskp = 0;
        String[] tasks = new String[N];
        for (int i=0; i<N; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();
            String task = sc.next();
            if (p>maxp) {
                taskp = i;
                maxp = p;
            }
            tasks[i] = task;
            tt += t;
        }
        System.out.println(tasks[taskp].substring(1,tasks[taskp].length()-1));
        tt *= 3;
        int hours = 0;
        while (tt>=60) {
            hours++;
            tt-=60;
        }
        while (hours>=24) {
            hours-=24;
        }
        System.out.printf("%02d", hours);
        System.out.printf("%02d", tt);
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