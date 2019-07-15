package src.AtCoder.abc133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class abc133_c {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int first = sc.nextInt();
        int second = sc.nextInt();
        int mod_fist = first%2019;
        int mod_second = second%2019;
        int ans = 2018;
        if (first+2020<=second) {
            ans = 0;
        }
        for (int i=mod_fist; i<=mod_second; i++) {
            for (int j=i+1; j<=mod_second; j++) {
                ans = Math.min(ans, (i*j)%2019);
            }
        }
        System.out.println(ans);
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
