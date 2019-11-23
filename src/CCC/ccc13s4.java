package src.CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ccc13s4 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer>[] map = new ArrayList[N];
        for (int i=0; i<N; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i=0; i<M; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            map[a].add(b);
        }
        boolean[] step = new boolean[N];
        LinkedList<Integer> queue = new LinkedList<>();
        int start = sc.nextInt()-1;
        int finish = sc.nextInt()-1;
        queue.add(start);
        step[start] = true;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i=0; i<map[temp].size(); i++) {
                if (map[temp].get(i)==finish) {
                    System.out.println("yes");
                    return;
                } else if (!step[map[temp].get(i)]) {
                    queue.add(map[temp].get(i));
                    step[map[temp].get(i)] = true;
                }
            }
        }
        boolean[] step2 = new boolean[N];
        LinkedList<Integer> queue2 = new LinkedList<>();
        queue2.add(finish);
        step2[finish] = true;
        while(!queue2.isEmpty()) {
            int temp = queue2.poll();
            for (int i=0; i<map[temp].size(); i++) {
                if (map[temp].get(i) == start) {
                    System.out.println("no");
                    return;
                } else if (!step2[map[temp].get(i)]) {
                    queue2.add(map[temp].get(i));
                    step2[map[temp].get(i)] = true;
                }
            }
        }
        System.out.println("unknown");
    }

    static class FastReader {
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}











































