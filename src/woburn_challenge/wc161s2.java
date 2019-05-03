package woburn_challenge;

import java.io.IOException;
import java.util.*;
import java.io.*;
public class wc161s2 {
    //public static void main(String[] args) throws IOException{

    static int n, m, answer;
    static ArrayList<Integer> [] edges = new ArrayList[200005],
            weights = new ArrayList[200005];
    static boolean [] treasure = new boolean[200005], important = new boolean[200005];
    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader(System.in);
        n = in.nextInt();
        m = in.nextInt();
        //make arraylist to store edges connecting to each node
        for (int l = 0; l <= n; ++l){
            edges[l] = new ArrayList<Integer>();
            weights[l] = new ArrayList<Integer>();
        }
        for (int l = 0; l < n - 1; ++l){
            //read edges and put in arraylist
            int start = in.nextInt(), end = in.nextInt(), dist = in.nextInt();
            edges[start].add(end);
            weights[start].add(dist);
            edges[end].add(start);
            weights[end].add(dist);
        }
        for (int l = 0; l < m; ++l){
            int room = in.nextInt();
            treasure[room] = true;
        }
        dfs(1, -1);
        System.out.println(answer);

    }
    static void dfs(int node, int parent){
        //traverse all nodes and store whether each room is necessary
        if (treasure[node]) {
            important[node] = true;
        }
        for (int l = 0; l < edges[node].size(); ++l){
            int child = edges[node].get(l);
            if (parent == child) continue; //make sure dfs does not cycle
            dfs(child, node);
            //visit child
            if (important[child]){
                //add edge if child is important
                important[node] = true;
                answer += weights[node].get(l);
            }
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
                catch (IOException  e)
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