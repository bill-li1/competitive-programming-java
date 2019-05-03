package other;

import java.util.Scanner;

public class bts18p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int calls = sc.nextInt();
		int time = sc.nextInt();
		int[] arr = new int[calls];
		for (int i=0; i<calls; i++) {
			arr[i] = sc.nextInt();
		}
		int out = 0;
		for (int i=0; i<time; i++) {
			out = out + arr[max(arr)];
			arr[max(arr)]--;
		}
		System.out.println(out);
	}
	public static int max (int[] arr) {
		int a = 0;
		int b = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>a) {
				a = arr[i];
				b = i;
			}
		}
		return b;
	}
}
	