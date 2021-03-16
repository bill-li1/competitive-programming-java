// package CSES;

import java.util.*;
import java.io.*;

public class Permutations {
  public static void main(String[] args) {
    FastReader sc = new FastReader(System.in);
    int n = sc.nextInt();
    if(n==2||n==3) {
      System.out.print("NO SOLUTION");
    } else {
      for(int i=2; i<=n; i+=2) {
        System.out.print(i + " ");
      }
      for(int i=1; i<=n; i+=2) {
        System.out.print(i + " ");
      }
    }
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
