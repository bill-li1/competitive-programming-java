package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wc181j4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rooms = Integer.parseInt(st.nextToken());
        int classes = Integer.parseInt(st.nextToken());
        int counter = 1;
        int prevroom = Integer.parseInt(br.readLine());
        for (int i=0; i<classes-1; i++) {
            int room = Integer.parseInt(br.readLine());
            if (Math.abs(room-prevroom)==1) counter += 1;
            else counter += 2;
            prevroom = room;
        }
        System.out.println(counter+1);
    }
}
