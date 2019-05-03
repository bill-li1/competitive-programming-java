package CCC;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc04s2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int A = sc.nextInt();
		int[][] arr = new int[A][B];
		for (int i=0; i<A; i++) {
			for (int j=0; j<B; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int top = 0;
		int topnumber = 0;
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i=0; i<B; i++) {
			int acc = 0;
			for (int j=0; j<A; j++) {
				acc = acc + arr[j][i];
			}
			if (acc>topnumber) {
				topnumber = acc;
				top = i;
			}
		}
		for (int i=0; i<B; i++) {
			int acc = 0;
			for (int j=0; j<A; j++) {
				acc = acc + arr[j][i];
			}
			if (acc==topnumber) {
				l.add(i);
			}
		}
		while (!l.isEmpty()) {
			int[] a = new int[B];
			int lowest = 0;
			int acc = 1;
			int t = l.poll();
			for (int i=0; i<A; i++) {
				for (int j=0; j<B; j++) {
					a[j] += arr[i][j];
				}
				for (int j=0; j<B; j++) {
					if (a[t]<a[j]) {
						acc++;
					}
				}
				if (acc>lowest) {
					lowest = acc;
				}
				acc=1;
			}
			System.out.println("Yodeller " + (t+1) + " is the TopYodeller: score " + topnumber + ", worst rank " + lowest);
		}
	}
}






























