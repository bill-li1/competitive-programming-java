// package CSES;

import java.util.*;
import java.io.*;

public class repetitions {
  public static void main(String[] args) {
    FastReader sc = new FastReader(System.in);
    String s = sc.next();
    long longest = 1;
    long temp = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        temp++;
      } else if (temp > longest) {
        longest = temp;
        temp = 1;
      } else {
        temp = 1;
      }
    }
    System.out.println(Math.max(temp, longest));
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
