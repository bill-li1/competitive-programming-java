package woburn_challenge;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class wc181j1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a*b > c) System.out.println("N");
        else System.out.println("Y");
    }
}
