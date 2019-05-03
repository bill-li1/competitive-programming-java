package dmoj_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class year2019p3 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = 0, end = 0;
        int[][] order = new int[N][N];
        boolean[][] map = new boolean[N][N];
        for (int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = true;
            order[a][b] = i;
            if (i==0) start = a;
            if (i==M-1) end = b;
        }
        int[] step = new int[N];
        Arrays.fill(step, Integer.MAX_VALUE);
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        step[start] = 0;
        while (!queue.isEmpty()) {
            int temp = queue.pop();
            for (int i=0; i<N; i++) {
               // if (map[i][temp] && step[i]>step[temp]+1 && )
            }
        }
    }
    static class FastReader
    {
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
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
