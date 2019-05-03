package dmoj_contest;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class year2018p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        minute += second/60;
        second = second%60;
        hour += minute/60;
        minute = minute%60;
        minute += (int)Math.ceil((double)second/(double)60);
        hour += (int)Math.ceil((double)minute/(double)60);
        int s = 60;
        int m = 60;
        int h = 12;
        s = (s-second)%60;
        m = (m-minute)%60;
        h = (12 - (hour%12))%12;
        System.out.printf("%02d", h);
        System.out.print(":");
        System.out.printf("%02d", m);
        System.out.print(":");
        System.out.printf("%02d", s);
    }
}
