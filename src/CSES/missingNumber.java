// package CSES;

import java.io.*;
import java.util.*;

public class missingNumber {
  public static void main(String[] args) {
    FastReader sc = new FastReader(System.in);
    long n = sc.nextLong();
    long total = 0;
    for (int i = 1; i <= n; i++) {
      total += i;
    }
    for (int i = 0; i < n - 1; i++) {
      long temp = sc.nextLong();
      total -= temp;
    }
    System.out.println(total);
  }
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader(InputStream x) {
      br = new BufferedReader(new InputStreamReader(x));

    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
