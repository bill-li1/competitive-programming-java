package src.AtCoder.abc132;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class abc132_a {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String S = sc.next();
        if (S.charAt(0)==S.charAt(1) && S.charAt(0)==S.charAt(2)) System.out.println("No");
        else if (S.charAt(0)==S.charAt(1) && S.charAt(2)==S.charAt(3)) System.out.println("Yes");
        else if (S.charAt(0)==S.charAt(2) && S.charAt(1)==S.charAt(3)) System.out.println("Yes");
        else if (S.charAt(0)==S.charAt(3) && S.charAt(1)==S.charAt(2)) System.out.println("Yes");
        else System.out.println("No");
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