package CCC;

import java.io.*;

public class ccc13j2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		boolean flag = true;
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)!='I' && S.charAt(i)!='O' && S.charAt(i)!='S' && S.charAt(i)!='H' && S.charAt(i)!='Z' && S.charAt(i)!='X' && S.charAt(i)!='N') {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
