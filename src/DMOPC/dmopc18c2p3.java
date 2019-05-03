package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class dmopc18c2p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken()) - 1;
        int B = Integer.parseInt(st.nextToken()) - 1;
        int[] stores = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            stores[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        boolean[][] map = new boolean[N][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            map[a][b] = true;
            map[b][a] = true;
        }
        int min = Integer.MAX_VALUE;
        int[] step = new int[N];
        Arrays.fill(step, Integer.MAX_VALUE);
        LinkedList<Integer> queue = new LinkedList<>();
        step[A] = 0;
        queue.add(A);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 0; i < N; i++) {
                if (map[temp][i] && step[i] > step[temp] + 1) {
                    queue.add(i);
                    step[i] = step[temp] + 1;
                }
            }
        }
        queue = new LinkedList<>();
        int[] step1 = new int[N];
        Arrays.fill(step1, Integer.MAX_VALUE);
        step1[B] = 0;
        queue.add(B);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 0; i < N; i++) {
                if (map[temp][i] && step1[i] > step1[temp] + 1) {
                    queue.add(i);
                    step1[i] = step1[temp] + 1;
                }
            }
        }
        for (int i=0; i<K; i++) {
            if (step[stores[i]] + step1[stores[i]] < min) {
                min = step[stores[i]] + step1[stores[i]];
            }
        }
        System.out.println(min);
    }
}
