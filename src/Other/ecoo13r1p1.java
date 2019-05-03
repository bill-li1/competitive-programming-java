package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ecoo13r1p1 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int tickets = T; 
		int students = 0;
		int studentsleft = 0;
		while (true) {
			String S = br.readLine();
			if (S.equals("EOF")) {
				break;
			}
			if (S.equals("TAKE")) {
				tickets++;
				check (tickets);
				students++;
				studentsleft++;
			}
			if (S.equals("SERVE")) {
				studentsleft--;
			}
			if (S.equals("CLOSE")) {
				System.out.println(students + " " + studentsleft + " " + tickets);
				studentsleft = 0;
				students = 0;
			}
		}
	}
	public static void check (int T) {
		if (T>999) {
			T=0;
		}
	}
}
