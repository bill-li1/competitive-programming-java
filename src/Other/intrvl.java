package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class intrvl {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] start = new int[N];
		int[] finish = new int[N];
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			start[i] = Integer.parseInt(st.nextToken());
			finish[i] = Integer.parseInt(st.nextToken());
		}
		for (int i=0; i<Q; i++) {
			int a = Integer.parseInt(br.readLine());
			int counter = 0;
			for (int j=0; j<N; j++) {
				if (start[j]<=a && finish[j]>=a) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
