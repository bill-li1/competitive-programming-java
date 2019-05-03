package other;

import java.util.Scanner;

public class coci09c1p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for (int i=0; i<=T; i++) {
			for (int j=i; j<=T; j++) {
				sum = sum + i + j;
			}
		}
		System.out.println(sum);
	}
}
