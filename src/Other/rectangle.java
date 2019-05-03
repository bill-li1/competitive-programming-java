package other;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		int tile = sc.nextInt();
		System.out.println((length/tile)*(width/tile));
	}
}
	