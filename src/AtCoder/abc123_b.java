package AtCoder;

import java.util.Arrays;
import java.util.Scanner;

public class abc123_b {

    public static class food implements Comparable<food> {
        int time;
        int wait;
        public food(int time, int wait) {
            this.time = time;
            this.wait = wait;
        }
        @Override
        public int compareTo (food o) {
            return this.wait-o.wait;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        food[] arr = new food[5];
        for (int i=0; i<5; i++) {
            int N = sc.nextInt();
            int T = N;
            if (N % 10 != 0) {
                T = (10 - T % 10);
            } else {
                T = 0;
            }
            arr[i] = new food(N, T);
        }
        Arrays.sort(arr);
        int counter = 0;
        int time = 0;
        while (true) {
            if (time%10==0 || time==0) {
                time += arr[counter].time;
                counter++;
                if (counter>4) {
                    System.out.println(time);
                    return;
                }
                continue;
            }
            time++;
        }
    }
}
