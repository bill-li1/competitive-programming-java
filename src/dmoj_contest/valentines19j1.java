package dmoj_contest;

import java.util.Scanner;

public class valentines19j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            long a = sc.nextLong();
            if (a<1000) System.out.println("Newbie");
            else if (a<1200) System.out.println("Amateur");
            else if (a<1500) System.out.println("Expert");
            else if (a<1800) System.out.println("Candidate Master");
            else if (a<2200) System.out.println("Master");
            else if (a<3000) System.out.println("Grandmaster");
            else if (a<4000) System.out.println("Target");
            else System.out.println("Rainbow Master");
        }
    }
}
