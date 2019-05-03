package CCC;

import java.util.Scanner;

public class ccc12s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] S = s.toCharArray();
		int sum = 0;
		for (int i=1; i<S.length-2; i+=2) {
			if (convert(S[i])>=convert(S[i+2])) {
				sum += (convert(S[i])*(S[i-1]-'0'));
			} else {
				sum -= (convert(S[i])*(S[i-1]-'0'));
			}
		}
		System.out.println(sum + ((S[S.length-2])-'0')*convert(S[S.length-1]));
	}
	public static int convert (char a) {
		if (a=='I') {
			return 1;
		} else if (a=='V') {
			return 5;
		} else if (a=='X') {
			return 10;
		} else if (a=='L') {
			return 50;
		} else if (a=='C') {
			return 100;
		} else if (a=='D') {
			return 500;
		} else {
			return 1000;
		}
	}
}
