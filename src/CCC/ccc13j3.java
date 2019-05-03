package CCC;

import java.io.*;
import java.util.Arrays;

public class ccc13j3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		while (true) {
			String S1 = S+"";
			char[] arr = S1.toCharArray();
			Arrays.sort(arr);
			boolean flag = true;
			for (int i=0; i<arr.length-1; i++) {
				if (arr[i]==arr[i+1]);
				flag = false;
			}
			if (flag) {
				System.out.println(S1);
				break;
			} else {
				S++;
			}
		}
	}
}

/*
package CCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ccc13j3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        while (true) {
            boolean flag = true;
            S++;
            String S1 = S+"";
            char[] S2 = S1.toCharArray();
            Arrays.sort(S2);
            for (int i=0; i<S2.length-1; i++) {
                if (S2[i]==S2[i+1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(S1);
                break;
            }
        }
    }
}
*/