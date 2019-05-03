package CCC;

import java.util.Scanner;

public class ccc07s3 {

	public static int[] parent;
	public static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean[][] friends = new boolean[T][T];
		for (int i=0; i<T; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			parent[b] = a;
		}
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (parentf(a, T, b)) {
				System.out.println("Yes :" + parentb(a, T , b));
			} else {
				System.out.println("No");
			}
		}
	}
	public static boolean parentf(int v, int a, int c) {
		counter++;
		if (counter>=a) {
			counter = 0;
			return false;
		}
		if (parent[v] == c) {
			counter = 0;
			return true;
		} else {
			return (parentf(parent[v], a, c));
		}
	}
	public static int parentb(int v, int a, int c) {
		counter++;
		if (parent[v] == c) {
			return counter;
		} else {
			return (parentb(parent[v], a, c));
		}
	}
}
