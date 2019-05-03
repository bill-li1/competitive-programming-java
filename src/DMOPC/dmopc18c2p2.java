package dmopc;

import java.util.Arrays;
import java.util.Scanner;

public class dmopc18c2p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		double people = sc.nextInt();
		int [] arr = new int[(int)people];
		for (int i=0; i<people; i++) {
			arr[i] = sc.nextInt();
		}
		int a = (int) Math.ceil(people/row);
		int[][] arr1 = new int[row][a];
		for (int i=0; i<row; i++) {
			Arrays.fill(arr1[i], Integer.MAX_VALUE);
		}
		int counter = 0;
		for (int r=0; r<row; r++) {
			for (int c=0; c<a; c++) {
				arr1[r][c] = arr[counter];
				if (counter==people) {
					break;
				} else {
					counter++;
				}
			}
			if (counter==people) {
				break;
			}
		}
		int output = 0;
		for (int i=0; i<a; i++) {
			for (int j=1; j<row; j++) {
				if (arr1[j][i] != Integer.MAX_VALUE) {
					int temp = arr1[j-1][i] - arr1[j][i];
					if (temp>0) {
						output += 1 + (temp);
						arr1[j][i] += 1 + (temp);
					}
				}
			}
		}
		System.out.println(output);
	}
}
