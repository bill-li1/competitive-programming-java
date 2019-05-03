package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class wc182j3 {
    public static void main(String[] args) {
        fastreader sc = new fastreader(System.in);
        int n = sc.nextInt();
        int counter = 0;
        LinkedList<String> names = new LinkedList<String>();
        for (int i=0; i<n; i++) {
            names.add(sc.next());
        }
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            if (names.contains(sc.next())) counter++;
        }
        System.out.println(counter);
    }
    static class fastreader
    {
        BufferedReader br;
        StringTokenizer st;
        public fastreader(InputStream x) {
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
