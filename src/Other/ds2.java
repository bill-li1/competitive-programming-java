package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ds2 {

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


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Edge[] edge = new Edge[M];
        parent = new int[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            edge[i] = new Edge(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
        }
        Arrays.fill(parent, -1);
        LinkedList<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < M; i++) {
            int bv = parent_function(edge[i].bv);
            int ev = parent_function(edge[i].ev);
            if (bv != ev) {
                queue.add(i + 1);
                count++;
                union(bv, ev);
                if (count == N - 1) {
                    break;
                }
            }
        }
        if (queue.size() == N - 1) {
            while (!queue.isEmpty()) {
                System.out.println(queue.pop());
            }
        } else {
            System.out.println("Disconnected Graph");
        }
    }

    public static int parent_function(int v) {
        if (parent[v] == -1) {
            return v;
        } else {
            return parent_function(parent[v]);
        }
    }

    public static void union(int a, int b) {
        parent[a] = b;
    }
}
