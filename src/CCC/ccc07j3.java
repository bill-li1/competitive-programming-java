package CCC;

import java.util.Scanner;

public class ccc07j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] boxes = new int[11];
		boxes[1] = 100;
		boxes[2] = 500;
		boxes[3] = 1000;
		boxes[4] = 5000;
		boxes[5] = 10000;
		boxes[6] = 25000;
		boxes[7] = 50000;
		boxes[8] = 100000;
		boxes[9] = 500000;
		boxes[10] = 1000000;
		for (int i=0; i<T; i++) {
			int S = sc.nextInt();
			boxes[S] = 0;
		}
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum = sum + boxes[i];
		}
		sum = sum/(10-T);
		int offer = sc.nextInt();
		if (sum>offer) System.out.println("no deal");
		else System.out.println("deal");
	}
}
