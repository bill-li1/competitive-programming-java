package CCC;

import java.util.Scanner;

public class ccc09j5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] friends = new boolean[18][18];
		int[] numberoffriends = new int[18];
		friends[1][5] = true;
		friends[0][5] = true;
		friends[2][5] = true;
		friends[3][5] = true;
		friends[4][5] = true;
		friends[2][3] = true;
		friends[3][4] = true;
		friends[2][4] = true;
		friends[5][6] = true;
		friends[6][7] = true;
		friends[7][8] = true;
		friends[8][9] = true;
		friends[9][10] = true;
		friends[10][11] = true;
		friends[8][11] = true;
		friends[11][12] = true;
		friends[12][13] = true;
		friends[12][14] = true;
		friends[15][16] = true;
		friends[16][17] = true;
		friends[17][15] = true;
		
		friends[5][1] = true;
		friends[5][0] = true;
		friends[5][2] = true;
		friends[5][3] = true;
		friends[5][4] = true;
		friends[3][2] = true;
		friends[4][3] = true;
		friends[4][2] = true;
		friends[6][5] = true;
		friends[7][6] = true;
		friends[8][7] = true;
		friends[9][8] = true;
		friends[10][9] = true;
		friends[11][10] = true;
		friends[11][8] = true;
		friends[12][11] = true;
		friends[13][12] = true;
		friends[14][12] = true;
		friends[16][15] = true;
		friends[17][16] = true;
		friends[15][17] = true;
		
	}
}


















