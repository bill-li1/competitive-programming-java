package src.CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class ccc01s3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] map = new boolean[26][26];
		LinkedList<String> out = new LinkedList<>();
		LinkedList<String> in = new LinkedList<>();
		while (true) {
			String a = br.readLine();
			if (a.equals("**")) {
				break;
			} else {
				in.add(a);
				map[a.charAt(0)-'A'][a.charAt(1)-'A'] = true;
				map[a.charAt(1)-'A'][a.charAt(0)-'A'] = true;
			}
		}
		int counter = 0;
		while (!in.isEmpty()) {
			String o = in.pop();
			map[o.charAt(0)-'A'][o.charAt(1)-'A'] = false;
			map[o.charAt(1)-'A'][o.charAt(0)-'A'] = false;
			int[] step = new int[26];
			Arrays.fill(step, Integer.MAX_VALUE);
			LinkedList<Integer> queue = new LinkedList<>();
			queue.add(0);
			step[0] = 1;
			while (!queue.isEmpty()) {
				int temp = queue.pop();
				for (int i=0; i<26; i++) {
					if (map[temp][i]==true && step[i]>step[temp]+1) {
						queue.add(i);
						step[i] = step[temp]+1;
					}
				}
			}
			/*
			System.out.println("=====>" + o);
			for (int i=0; i<10; i++) {
				System.out.println(step[i]);
			}
			for (int i=0; i<10; i++) {
				for (int j=0; j<10; j++) {
					System.out.print(map[i][j]  + " ");
				}
				System.out.println(" ");
			}
			System.out.println("-----");
			*/
			if (step[1]==Integer.MAX_VALUE) {
				counter++;
				out.add(o);
			}
			map[o.charAt(0)-'A'][o.charAt(1)-'A'] = true;
			map[o.charAt(1)-'A'][o.charAt(0)-'A'] = true;
		}
		while (!out.isEmpty()) {
			System.out.println(out.pop());
		}
		System.out.println("There are " + counter + " disconnecting roads.");
	}
}
