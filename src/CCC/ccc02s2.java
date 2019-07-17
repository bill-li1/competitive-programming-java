package src.CCC;

import java.util.Scanner;

public class ccc02s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = A;
		int b = B;
		if (A==0) {
			System.out.println(0);
			return;
		}
		int C = Math.min(A, B);
		for (int i=C; i>=2; i--) {
			if (A%i==0 && B%i==0) {
				A = A/i;
				B = B/i;
			}
		}
		if ((int)Math.floor(A/B)<1) {
			System.out.println(A%B + "/" + B);
		} else if (A==a && B==b) {
			System.out.println((int)Math.floor(A/B) + " " + A%B + "/" + B);
		} else if (A%B==0){
			System.out.println(A/B);
		} else {
			System.out.println((int)Math.floor(A/B) + " " + A%B + "/" + B);
		}
	}
}
