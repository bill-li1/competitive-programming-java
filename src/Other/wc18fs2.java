package src.Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class wc18fs2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        for (int i=0; i<R; i++) {
            Arrays.fill(map[i], '.');
        }
        map[R-1][0] = 'S';
        map[R-2][C-1] = 'E';
        int col = 1;
        for (int r=R-2; r>0; r--) {
            map[r][col] = '#';
            if (col == C-2) {
                break;
            }
            col++;
        }
        for (int r=0; r<R; r++) {
            for (int c=0; c<C; c++) {
                System.out.print(map[r][c]);
            }
            System.out.println();
        }
    }
}
