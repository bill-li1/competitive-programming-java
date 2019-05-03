package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class ccc12s3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i=0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
		int first = mostFrequent1(arr);
		int counter = 0;
		for (int i=0; i<T; i++) {
			if (arr[i]==first) {
				counter++;
			}
		}
		int[] a = new int[T-counter];   
		int index = 0;
		for (int i=0; i<T; i++) {
			if (arr[i]!=first) {
				a[index] = arr[i];
				index++;
			}
		}
		int second = mostFrequent2(a);
		System.out.println(Math.abs(first-second));
	}
	static int mostFrequent1(int arr[]) {
		Arrays.sort(arr);
		int max = 1;
		int curr = 1;
		int res = arr[0]; 
		for (int i=1; i<arr.length; i++) {
			if (arr[i]==arr[i-1]) {
				curr++;
			} else if (curr > max) {
				max = curr;
				res = arr[i-1];
				curr = 1;
			} else if (curr==max && arr[i-1]>res) {
				max = curr;
				res = arr[i-1];
				curr = 1;
			} else {
				curr = 1;
			}
		}
		if (curr > max) {
			max = curr;
			res = arr[arr.length-1];
		} else if (curr==max && arr[arr.length-1]>res) {
			max = curr;
			res = arr[arr.length-1];
		}
		return (res);
	}
	static int mostFrequent2(int arr[]) {
		Arrays.sort(arr);
		int max = 1;
		int curr = 1;
		int res = arr[0]; 
		for (int i=1; i<arr.length; i++) {
			if (arr[i]==arr[i-1]) {
				curr++;
			} else if (curr > max) {
				max = curr;
				res = arr[i-1];
				curr = 1;
			} else if (curr==max && arr[i-1]<res) {
				max = curr;
				res = arr[i-1];
				curr = 1;
			} else {
				curr = 1;
			}
		}
		if (curr > max) {
			max = curr;
			res = arr[arr.length-1];
		} else if (curr==max && arr[arr.length-1]<res) {
			max = curr;
			res = arr[arr.length-1];
		}
		return (res);
	}
}
