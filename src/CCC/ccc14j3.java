package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc14j3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int A = 100;
		int D = 100;
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a>b) {
				D-=a;
			} else if (b>a) {
				A-=b;
			} 
		}
		System.out.println(Math.max(A, 0));
		System.out.println(Math.max(D, 0));
	}
}
