package src.AtCoder.abc131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class abc131_b {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i=1; i<=N; i++) {
            arr[i] = i+L-1;
        }
        int mindist = 0x3f3f3f3f;
        int minpos = 0;
        for (int i=1; i<=N; i++) {
            if (Math.abs(arr[i])<mindist) {
                mindist = Math.abs(arr[i]);
                minpos = i;
            }
        }
        arr[minpos] = 0;
        int sum = 0;
        for (int i=1; i<=N; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
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
