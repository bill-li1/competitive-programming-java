package dmoj_contest;

        import java.util.Scanner;

public class valentines19j3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        double e = 0;
        double l = 0;
        double o = 0;
        double v = 0;
        for (int i=S.length()-1; i>=0; i--) {
            if (S.charAt(i)=='e') {
                e++;
            } else if (S.charAt(i)=='v') {
                v+=e;
            } else if (S.charAt(i)=='o') {
                o+=v;
            } else if (S.charAt(i)=='l') {
                l+=o;
            }
        }
        System.out.printf("%.0f", l);
    }
}
