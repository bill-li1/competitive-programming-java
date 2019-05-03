package CCC;

import java.io.*;

public class ccc15j2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		char[] arr = S.toCharArray();
		int a = 0;
		int b = 0;
		for (int i=0; i<arr.length-2; i++) {
			if (arr[i]==':' && arr[i+1]=='-' && arr[i+2]==')') {
				a++;
			} else if (arr[i]==':' && arr[i+1]=='-' && arr[i+2]=='(') {
				b++;
			}
		}
		if (a>b) System.out.println("happy");
		else if (b>a) System.out.println("sad");
		else if (b==0 && a==0) System.out.println("none");
		else System.out.println("unsure");
	}
}