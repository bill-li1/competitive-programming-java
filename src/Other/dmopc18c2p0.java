package other;

import java.util.Scanner;

public class dmopc18c2p0 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = c/b;
		System.out.println(Math.min(d, a));
	}
}
