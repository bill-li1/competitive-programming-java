// package CSES;

import java.util.*;
import java.io.*;

public class increasingArray {
  public static void main(String[] args) {
    FastReader sc = new FastReader(System.in);
    int n = sc.nextInt();
    long moves = 0;
    long min = sc.nextLong();
    for (int i = 1; i < n; i++) {
      long x = sc.nextLong();
      if (x < min) {
        moves += min - x;
      } else {
        min = x;
      }
    }
    System.out.println(moves);
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
