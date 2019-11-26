package src.School.Markville_Inaugral_Computing_Contest.Junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] tasks = new String[N];
        int totaltime = 0;
        int max = 0;
        int pos = 0;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int priority = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            tasks[i] = st.nextToken();
            totaltime += time;
            if (priority>max) {
                max = priority;
                pos = i;
            }
        }
        System.out.println(tasks[pos].substring(1,tasks[pos].length()-1));
        int hour = 0;
        totaltime*=3;
        while (totaltime-60>=0) {
            hour++;
            if (hour>=24) {
                hour = 0;
            }
            totaltime-=60;
        }
        if (hour>=24) {
            hour = 0;
        }
        System.out.printf("%02d", hour);
        System.out.printf("%02d%n", totaltime);
    }
}
