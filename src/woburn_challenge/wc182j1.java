    package woburn_challenge;

    import java.util.Scanner;

    public class wc182j1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a<b) {
                System.out.println((b-a)*c);
                return;
            }
            if (b<a) {
                System.out.println((a-b)*d);
                return;
            }
            System.out.println(0);
        }
    }
