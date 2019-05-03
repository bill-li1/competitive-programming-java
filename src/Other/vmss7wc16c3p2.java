package other;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class vmss7wc16c3p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt()-1;
		int B = sc.nextInt()-1;
		boolean[][] map = new boolean[N][N];
		int[] step = new int[N];
		for (int i=0; i<M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			map[a][b] = true;
			map[b][a] = true;
		}
		Arrays.fill(step, Integer.MAX_VALUE);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		step[A] = 0;
		queue.add(A);
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i=0; i<N; i++) {
				if (map[temp][i] && step[i]>step[temp]+1) {
					queue.add(i);
					step[i] = step[temp] + 1;
				}
			}
		}
		if (step[B]!=Integer.MAX_VALUE) {
			System.out.println("GO SHAHIR!");
		} else {
			System.out.println("NO SHAHIR!");
		}
	}
}
