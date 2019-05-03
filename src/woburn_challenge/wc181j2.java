package woburn_challenge;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class wc181j2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        for (int i=0; i<5; i++) {
            String name = br.readLine();
            if (N.equals(name)) {
                System.out.println("Y");
                return;
            }
        }
        System.out.println("N");
    }
}
