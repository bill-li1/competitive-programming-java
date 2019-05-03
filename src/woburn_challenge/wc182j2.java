package woburn_challenge;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class wc182j2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(":");
        int hour = Integer.parseInt(a[0]);
        int minute = Integer.parseInt(a[1]);
        System.out.println(hour*60 + minute);
    }
}
