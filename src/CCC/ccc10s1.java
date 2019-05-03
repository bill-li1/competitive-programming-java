package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc10s1 {

	static Computer[] computer;

	public static class Computer implements Comparable <Computer> {
		
		String name;
		int r;
		int s;
		int d;
		int value;

		public Computer (String name, int r, int s, int d) {
			this.name = name;
			this.r = r;
			this.s = s;
			this.d = d;
			this.value = 2*r + 3*s + d;
		}

		@Override
		public int compareTo(Computer o) {

			if(this.value < o.value) {
				return - 1;
			} else if (this.value > o.value) {
				return 1;
			} else {
				if(this.name.compareTo(o.name) > 0) {
					return -1;
				} else if (this.name.compareTo(o.name) < 0) {
					return 1;
				} else {
					return 0;
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n == 0) {
			return;
		}

		computer = new Computer [n];

		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			computer[i] = new Computer(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(computer);

		if(n == 1) {
			System.out.print(computer[n-1].name);
		} else {
			System.out.println(computer[n-1].name);
			System.out.println(computer[n-2].name);
		}
	}
}