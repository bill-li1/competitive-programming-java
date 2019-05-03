package other;

import java.util.Scanner;

public class dmopc18c2p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int mr = 0;
		int mc = 0;
		int lr = 0;
		int lc = 0;
		for (int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a<lr) {
				lr = a;
			} else if (a>mr) {
				mr = a;
			}
			if (b<lc) {
				lc = b;
			} else if (b>mc) {
				mc = b;
			}
		}
		System.out.println(2*(mr-lr) + 2*(mc-lc));
	}
}
