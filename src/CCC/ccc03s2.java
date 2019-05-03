package CCC;

import java.util.Scanner;

public class ccc03s2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int x=0; x<T; x++) {
			String a2 = sc.nextLine();
			String b2 = sc.nextLine();
			String c2 = sc.nextLine();
			String d2 = sc.nextLine();
			String[] aa = a2.split(" ");
			String[] ab = b2.split(" ");
			String[] ac = c2.split(" ");
			String[] ad = d2.split(" ");
			String a = aa[aa.length-1];
			String b = ab[ab.length-1];
			String c = ac[ac.length-1];
			String d = ad[ad.length-1];
 			if (end(a).equals(end(b)) && end(a).equals(end(c)) && end(a).equals(end(d))) {
				System.out.println("perfect");
			} else if (end(a).equals(end(b)) && end(c).equals(end(d))) {
				System.out.println("even");
			} else if (end(a).equals(end(c)) && end(b).equals(end(d))) {
				System.out.println("cross");
			} else if (end(a).equals(end(d)) && end(b).equals(end(c))) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}
	}
	public static String end (String O) {
		for (int i=O.length()-1; i>0; i--) {
			if (O.charAt(i)=='a' || O.charAt(i)=='e' || O.charAt(i)=='i' || O.charAt(i)=='o' || O.charAt(i)=='u') {
				return (O.substring(i));
			}
		}
		return (O);
	}
}
