package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ccc10s2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] number = new String[T];
		String[] letter = new String[T];
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			letter[i] = st.nextToken();
			number[i] = st.nextToken();
		}
		String A = br.readLine();
		while (true) {
			if (A.length()==0) {
				break;
			}
			for (int i=0; i<T; i++) {
				if (A.startsWith(number[i])) {
					System.out.print(letter[i]);
					A = A.substring(number[i].length());
					break;
				}
			}
		}
	}
}