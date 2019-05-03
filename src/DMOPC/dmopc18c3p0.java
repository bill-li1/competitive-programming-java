package dmopc;

import java.util.Scanner;

public class dmopc18c3p0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		if ((int)(Math.sqrt(a))==(int)(Math.sqrt(a1)) &&
				(int)(Math.sqrt(b))==(int)(Math.sqrt(b1)) && 
				(int)(Math.sqrt(c))==(int)(Math.sqrt(c1))) {
			System.out.println("Dull");
		} else {
			System.out.println("Colourful");
		}
	}
}
