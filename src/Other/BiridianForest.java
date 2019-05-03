package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BiridianForest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char[][] map = new char[R][C];
		for (int i=0; i<R; i++) {
			String S = br.readLine();
			map[i] = S.toCharArray();
		}
		int[][] step = new int[R][C];
		LinkedList<Integer> r = new LinkedList<>();
		LinkedList<Integer> c = new LinkedList<>();
		LinkedList<Integer> rowq = new LinkedList<>();
		LinkedList<Integer> colq = new LinkedList<>();
		int sr = 0;
		int sc = 0;
		for (int i=0; i<R; i++) {
			for (int j=0; j<C; j++) {
				step[i][j] = Integer.MAX_VALUE;
				if (map[i][j]=='E') {
					rowq.add(i);
					colq.add(j);
					step[i][j] = 0;
				} else if (map[i][j]=='S') {
					sr = i;
					sc = j;
				} else if (map[i][j]-'0'>0) {
					r.add(i);
					c.add(j);	
				}
			}
		}
		while (!rowq.isEmpty()) {
			int row = rowq.poll();
			int col = colq.poll();
			if (row-1>=0 && step[row-1][col]>step[row][col]+1 && map[row-1][col]!='T') {
				rowq.add(row-1);
				colq.add(col);
				step[row-1][col] = step[row][col]+1;
			}
			if (row+1<R && step[row+1][col]>step[row][col]+1 && map[row+1][col]!='T') {
				rowq.add(row+1);
				colq.add(col);
				step[row+1][col] = step[row][col]+1;
			}
			if (col-1>=0 && step[row][col-1]>step[row][col]+1 && map[row][col-1]!='T') {
				rowq.add(row);
				colq.add(col-1);
				step[row][col-1] = step[row][col]+1;
			}
			if (col+1<C && step[row][col+1]>step[row][col]+1 && map[row][col+1]!='T') {
				rowq.add(row);
				colq.add(col+1);
				step[row][col+1] = step[row][col]+1;
			}
		}
		int counter = 0;
		while (!r.isEmpty()) {
			int a = r.poll();
			int b = c.poll();
			if (step[a][b]<=step[sr][sc]) {
				counter+=(map[a][b]-'0');
			}
		}
		System.out.println(counter);
	}
}




















