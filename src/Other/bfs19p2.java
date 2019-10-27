package src.Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class bfs19p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] step = new int[N][N];
        char[][] map = new char[N][N];
        for (int i=0; i<N; i++) {
            String S = br.readLine();
            map[i] = S.toCharArray();
        }
        for (int i=0; i<N; i++) {
            Arrays.fill(step[i], 0x3f3f3f3f);
        }
        LinkedList<Integer> rowq = new LinkedList<>();
        LinkedList<Integer> colq = new LinkedList<>();
        rowq.add(0);
        colq.add(0);
        step[0][0] = 1;
        int D=0,L=0,R=0;
        while (!rowq.isEmpty()) {
            int row = rowq.poll();
            int col = colq.poll();
            if (row+1<N && step[row+1][col]>step[row][col]+1 && map[row+1][col]!='#') {
                rowq.add(row+1);
                colq.add(col);
                step[row+1][col] = step[row][col]+1;
                D++;
            }
            if (col-1>=0 && step[row][col-1]>step[row][col]+1 && map[row][col-1]!='#') {
                rowq.add(row);
                colq.add(col-1);
                step[row][col-1] = step[row][col]+1;
                R++;
            }
            if (col+1<N && step[row][col+1]>step[row][col]+1  && map[row][col+1]!='#') {
                rowq.add(row);
                colq.add(col+1);
                step[row][col+1] = step[row][col]+1;
                L++;    
            }
        }
        System.out.println(D + " " + R + " " + L);
        if (step[N-1][N-1]==0x3f3f3f3f) System.out.println(-1);
        else System.out.println(Math.pow(D,2) + Math.pow(L,2) + Math.pow(R,2));
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(step[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
