package CCC;

        import java.util.Scanner;

public class nccc6j3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();
            boolean flag = false;
            for (int s = 0; s<=m; s++) {
                for (int t = 0; t<=m; t++) {
                    if (((a*s) + (b*t))==m) {
                        flag = true;
                    }
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
