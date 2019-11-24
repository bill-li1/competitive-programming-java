package src.AtCoder.abc145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc145_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        if (N%2==1) {
            System.out.println("No");
        } else {
            int counter1 = 0;
            int counter2 = (N/2);
            for (int i=0; i<N/2; i++) {
                if (S.charAt(counter1)!=S.charAt(counter2)) {
                    System.out.println("No");
                    return;
                }
                counter1++;
                counter2++;
            }
            System.out.println("Yes");
        }
    }
}