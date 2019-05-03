package dmoj_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class year2019p2 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] status = new int[N];
        int[] first = new int[N];
        int[] second = new int[N];
        for (int i=0; i<N; i++) {
            first[i] = sc.nextInt()-1;
            second[i] = sc.nextInt()-1;
        }
        String out = "";
        for (int i=0; i<M; i++) {
            int ball = 0;
            while (true) {
                if (status[ball]==0) {
                    status[ball] = 1;
                    ball = first[ball];
                } else {
                    status[ball] = 0;
                    ball = second[ball];
                }
                if (ball==N) break;
            }
        }
        for (int j=0; j<N; j++) {
            if (status[j]==0) {
                out += "0";
            } else {
                out += "1";
            }
        }
        System.out.println(out);
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
