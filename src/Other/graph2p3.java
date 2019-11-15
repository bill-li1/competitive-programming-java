package src.Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class graph2p3 {

    public static class Edge {
        int bv, ev;

        public Edge() {
        }

        public Edge(int bv, int ev) {
            this.bv = bv;
            this.ev = ev;
        }
    }

    public static int[] parent;

    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        LinkedList<Edge> edges = new LinkedList<>();
        parent = new int[N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int s = sc.nextInt();
                if (s==1) {
                    edges.add(new Edge(i,j));
                }
            }
        }
        Arrays.fill(parent,-1);
        LinkedList<Integer> queue = new LinkedList<>();
        int count = 0;
        int total = edges.size()/2;
        for (int i=0; i<edges.size(); i++) {
            int bv = parent_function(edges.get(i).bv);
            int ev = parent_function(edges.get(i).ev);
            if (bv!=ev) {
                count++;
                union(bv,ev);
            }
        }
        System.out.println(total-count);
    }
    static int parent_function(int v) {
        if (parent[v]==-1) {
            return v;
        } else {
            return parent_function(parent[v]);
        }
    }
    static void union(int a, int b) {
        parent[a] = b;
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
