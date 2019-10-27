package src.CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc00s4 {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int D = sc.nextInt(), N = sc.nextInt();
        int[] clubs = new int[N], dp = new int[5500];
        for (int i=0; i<N; i++) {
            clubs[i] = sc.nextInt();
        }
        Arrays.fill(dp, 0x3f3f3f3f);
        dp[0] = 0;
        for (int i=0; i<D; i++) {
            for (int j=0; j<N; j++) {
                dp[i + clubs[j]] = Math.min(dp[i + clubs[j]], dp[i]+1);
            }
        }
        if (dp[D]==0x3f3f3f3f)  System.out.println("Roberta acknowledges defeat.");
        else System.out.println("Roberta wins in " + dp[D] + " strokes.");
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
