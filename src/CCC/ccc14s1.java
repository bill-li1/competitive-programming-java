package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ccc14s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> friends = new LinkedList<Integer>();
		for (int i=0; i<K; i++) {
			friends.add(i+1);
		}
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int[] arr = new int[friends.size()];
			for (int j=0; j<friends.size(); j++) {
				arr[j] = friends.get(j);
			}
			for (int j=0; j<arr.length; j++) {
				if ((j+1)%R==0) {
					arr[j] = 0;
				}
			}
			friends.clear();
			for (int j=0; j<arr.length; j++) {
				if (arr[j]!=0) {
					friends.add(arr[j]);
				}
			}
		}
		for (int i=0; i<friends.size(); i++) {
			System.out.println(friends.get(i));
		}
	}
}







