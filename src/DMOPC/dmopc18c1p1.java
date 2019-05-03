package DMOPC;

import java.util.LinkedList;
import java.util.Scanner;

public class dmopc18c1p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		int max = 0;
		LinkedList<Integer> zero = new LinkedList<>();
		for (int i=0; i<T; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]==0) {
				zero.add(i);
			}
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		for (int i=1; i<=max; i++) {
			for (int j=0; j<zero.size(); j++) {
				int temp = zero.get(j);
				arr[temp] = i;
			}
			System.out.println();
			if (sorted(arr)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	public static boolean sorted(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
