package src.AtCoder.abc141;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class abc141_c {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N=sc.nextInt(), K=sc.nextInt(), Q=sc.nextInt();
        int[] arr = new int[N+1];
        for (int i=0; i<Q; i++) {
            int temp = sc.nextInt();
            arr[temp]++;
        }
        for (int i=1; i<=N; i++) {
            if (K-Q+arr[i]>0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
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
