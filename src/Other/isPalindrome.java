package other;

import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(is(S));
	}
	public static boolean is(String S) {
		int a = S.length()-1;
		int b = 0;
		while (a>b) {
			if (S.charAt(a)!=S.charAt(b)) {
				return false;
			} else {
				a--;
				b++;
			}
		}
		return true;
	}
}
