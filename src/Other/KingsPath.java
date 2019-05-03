package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class KingsPath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		boolean[][] map = new boolean[100][100];
		int[][] step = new int[100][100];
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());
			for (int j=a2; j<=a3; j++) {
				map[a1][j] = true;
			}
		}
		LinkedList <Integer> rowq = new LinkedList<>();
		LinkedList <Integer> colq = new LinkedList<>();
		for (int i=0; i<100; i++) {
			Arrays.fill(step[i], Integer.MAX_VALUE);
		}
		map[a][b] = true;
		step[a][b] = 0;
		rowq.add(a);
		colq.add(b);
		while (!rowq.isEmpty()) {
			int row = rowq.poll();
			int col = colq.poll();
	    	if (row-1>=0 && step[row-1][col]>step[row][col]+1 && map[row-1][col]==true) {
	    		rowq.add(row-1);
	    		colq.add(col);
	    		step[row-1][col] = step[row][col]+1;
	    	}
	    	if (row+1<100 && step[row+1][col]>step[row][col]+1 && map[row+1][col]==true) {
	    		rowq.add(row+1);
	    		colq.add(col);
	    		step[row+1][col] = step[row][col]+1;
	    	}
	    	if (col-1>=0 && step[row][col-1]>step[row][col]+1 && map[row][col-1]==true) {
	    		rowq.add(row);
	    		colq.add(col-1);
	    		step[row][col-1] = step[row][col]+1;
	    	}
	    	if (col+1<100 && step[row][col+1]>step[row][col]+1 && map[row][col+1]==true) {
	    		rowq.add(row);
	    		colq.add(col+1);
	    		step[row][col+1] = step[row][col]+1;
	    	}
	    	if (row-1>=0 && col-1>=0 && step[row-1][col-1]>step[row][col]+1 && map[row-1][col-1]==true) {
	    		rowq.add(row-1);
	    		colq.add(col-1);
	    		step[row-1][col-1] = step[row][col]+1;
	    	}
	    	if (row+1<100 && col+1<100 && step[row+1][col+1]>step[row][col]+1 && map[row+1][col+1]==true) {
	    		rowq.add(row+1);
	    		colq.add(col+1);
	    		step[row+1][col+1] = step[row][col]+1;
	    	}
	    	if (col-1>=0 && row+1<100 && step[row+1][col-1]>step[row][col]+1 && map[row+1][col-1]==true) {
	    		rowq.add(row+1);
	    		colq.add(col-1);
	    		step[row+1][col-1] = step[row][col]+1;
	    	}
	    	if (col+1<100 && row-1>=0 && step[row-1][col+1]>step[row][col]+1 && map[row-1][col+1]==true) {
	    		rowq.add(row-1);
	    		colq.add(col+1);
	    		step[row-1][col+1] = step[row][col]+1;
	    	}
		}
		if (step[c][d]==Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
		System.out.println(step[c][d]);
		}
	}
}
