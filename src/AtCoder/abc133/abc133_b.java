package src.AtCoder.abc133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class abc133_b {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] a = new int[N][D];
        for (int i=0; i<N; i++) {
            for (int j=0; j<D; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                int temp_dist = 0;
                for (int ii=0; ii<D; ii++) {
                    temp_dist += Math.pow(Math.abs(a[i][ii]-a[j][ii]),2);
                }
                double dist = Math.sqrt(temp_dist);
                if (dist == (int)dist) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
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
