package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class graph2p3 {

    static int T;
    static ArrayList<Integer> [] edges = new ArrayList[1005];

    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        T = sc.nextInt();
        

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
