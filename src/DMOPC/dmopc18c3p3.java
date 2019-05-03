package dmopc;

import java.util.Arrays;
import java.util.Scanner;

public class dmopc18c3p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int counter = 0;
		for (int i=0; i<T; i++) {
			for (int j=i+1; j<=T; j++) {
				char[] temp = Arrays.copyOfRange(arr, i, j);
				if (isSuspicious(temp)) {
					counter++;
					for (int q=0; q<temp.length; q++) {
						System.out.print(temp[q]);
					}
					System.out.println();
				}
			}
		}
		System.out.println(counter);
	}
	static boolean isSuspicious(char[] str) 
    { 
        int n = str.length; 
        int count = 1; 
        int cur_count = 1; 
  
        // Traverse string except last character 
        for (int i = 0; i < n; i++) 
        { 
            // If current character matches with next 
            if (i < n - 1 && str[i] == str[i+1]) 
                cur_count++; 
  
            // If doesn't match, update result 
            // (if required) and reset count 
            else
            { 
                if (cur_count > count) 
                { 
                    count = cur_count;  
                } 
                cur_count = 1; 
            } 
        } 
        if (count*2 >= str.length) {
        	return true;
        } else {
        	return false;
        }
    } 
}
