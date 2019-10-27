package src.AtCoder.abc134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class abc134_c {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int arr[] = new int[N];
        int second[] = new int[N];
        for (int i=0; i<N; i++) {
            int S = sc.nextInt();
            arr[i] = S;
            second[i] = S;
        }
        Arrays.sort(second);
        int max = second[N-1];
        int max2 = second[N-2];
        for (int i=0; i<N; i++) {
            if (arr[i]==max) {
                System.out.println(max2);
            } else {
                System.out.println(max);
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
