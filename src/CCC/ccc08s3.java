package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class ccc08s3 {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int x=0; x<T; x++) {
			int R = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			char [][] map = new char[R][C];
			int[][] step = new int[R][C];
			for (int i=0; i<R; i++) {
				map[i] = br.readLine().toCharArray();
			}
			for (int i=0; i<R; i++) {
				Arrays.fill(step[i], Integer.MAX_VALUE);
			}
		    LinkedList<Integer> rowq = new LinkedList<Integer>();
		    LinkedList<Integer> colq = new LinkedList<Integer>();
		    rowq.add(0);
		    colq.add(0);
		    step[0][0] = 1;
		    while(!rowq.isEmpty()) { 
		    	int row = rowq.poll();
		    	int col = colq.poll();
		    	if (row-1>=0 && step[row-1][col]>step[row][col]+1 && map[row-1][col]!='*' && map[row][col]!='-') {
		    		rowq.add(row-1);
		    		colq.add(col);
		    		step[row-1][col] = step[row][col]+1;
		    	}
		    	if (row+1<R && step[row+1][col]>step[row][col]+1 && map[row+1][col]!='*' && map[row][col]!='-') {
		    		rowq.add(row+1);
		    		colq.add(col);
		    		step[row+1][col] = step[row][col]+1;
		    	}
		    	if (col-1>=0 && step[row][col-1]>step[row][col]+1 && map[row][col-1]!='*' && map[row][col]!='|') {
		    		rowq.add(row);
		    		colq.add(col-1);
		    		step[row][col-1] = step[row][col]+1;
		    	}
		    	if (col+1<C && step[row][col+1]>step[row][col]+1 && map[row][col+1]!='*' && map[row][col]!='|') {
		    		rowq.add(row);
		    		colq.add(col+1);
		    		step[row][col+1] = step[row][col]+1;
		    	}
		    }
		    if (step[R-1][C-1]==Integer.MAX_VALUE) {
		    	System.out.println(-1);
		    } else {
		    	System.out.println(step[R-1][C-1]);
		    }
 		}
	}
}