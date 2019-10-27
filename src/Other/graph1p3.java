package src.Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class graph1p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ountput = 0;
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] edges = new ArrayList[15];
        for (int i=0; i<N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                if (Integer.parseInt(st.nextToken())==1) {
                    edges[i].add(j);
                }
            }
        }

    }
}
