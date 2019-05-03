package other;

import java.util.Scanner;

public class bts18p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String S = sc.nextLine();
		// S = S.replaceAll("\\s+","");
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String c = sc.next();
			int counter = 0;
			for (int j=a-1 ; j<=b-1; j++) {
				if (S.charAt(j)==(c.charAt(0))) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
