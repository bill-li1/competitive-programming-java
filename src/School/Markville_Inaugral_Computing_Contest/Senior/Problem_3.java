package src.School.Markville_Inaugral_Computing_Contest.Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem_3 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        boolean[][] map = new boolean[N][N];
        for (int i=0; i<N-1; i++) {
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            map[a][b] = true;
            map[b][a] = true;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        int[] step = new int[N];
        Arrays.fill(step, 0x3f3f3f3f);
        queue.add(0);
        step[0] = 1;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i=0; i<N; i++) {
                if (map[temp][i] && step[i]>step[temp]+1) {
                    queue.add(i);
                    step[i] = step[temp]+1;
                }
            }
        }
        int start = 0;
        int min = 0;
        for (int i=0; i<N; i++) {
            if (step[i]>min) {
                start = i;
                min = step[i];
            }
        }
        queue.add(start);
        Arrays.fill(step, 0x3f3f3f3f);
        step[start] = 1;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i=0; i<N; i++) {
                if (map[temp][i] && step[i]>step[temp]+1) {
                    queue.add(i);
                    step[i] = step[temp]+1;
                }
            }
        }
        for (int i=0; i<N; i++) {
            if (step[i] == 0x3f3f3f3f) {
                step[i] = -1;
            }
        }
        Arrays.sort(step);
        System.out.println(step[N-1]);
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