package woburn_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class wc182s3 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] ui = sc.readLine().split("\\s+");
        int totalBomb = Integer.parseInt(ui[0]);
        int bombsDefused = Integer.parseInt(ui[1]);
        int totalWires = 2 * totalBomb;
        int remainingBombs = totalBomb - bombsDefused;
            double[][] dp = new double[bombsDefused * 2 + remainingBombs + 2][bombsDefused + 2];//dp[i][j] is probability that j bombs completed at i wires cut
        dp[0][0] = 1;
        for (int i = 0; i < bombsDefused * 2 + remainingBombs + 1; i++) {//maximum possible wire num is 2 wires for each defused bomb + 1 wire for each remaining bomb
            for (int j = 0; j <= bombsDefused; j++) {
                int wiresLeft = totalWires - i;
                int partialBombWireNum = i - j * 2;
                double bombFinishProb = (double) partialBombWireNum / (double) wiresLeft;
                double cache=dp[i][j];
                dp[i + 1][j + 1] += cache * bombFinishProb;//chance that a bomb will be completed
                dp[i + 1][j] += cache * (1 - bombFinishProb);//chance that no bomb will be completed
            }
        }
        double sum = 0;
        double weight = 0;
        for (int i = 0; i < dp.length; i++) {
            double cache=dp[i][bombsDefused];
            sum += (totalWires - i) * cache;
            weight += cache;
        }
        System.out.println(sum / weight);
    }
}