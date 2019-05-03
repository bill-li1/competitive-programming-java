package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class graph2p1 {

    static int m;
    static ArrayList<Integer> [] edges = new ArrayList[1005];
    static LinkedList<Integer> out = new LinkedList<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        m = sc.nextInt();
        for (int i=0; i<m; ++i) {
            edges[i] = new ArrayList<>();
        }
        for (int r=0; r<m; ++r) {
            for (int c=0; c<m; ++c) {
                int a = sc.nextInt();
                if (a==1) {
                    System.out.println(r + " " + c);
                    edges[r].add(c);
                    edges[c].add(r);
                }
            }
        }
        System.out.println(out);
    }
    static void dfs (int node, int parent) {
        for (int i=0; i<edges[node].size(); ++i) {
            int child = edges[node].get(i);
            if (parent==child) continue; // already visited - does not cycle
            out.add(child);
            dfs(child, parent);
        }
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
