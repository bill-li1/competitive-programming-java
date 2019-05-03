package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc18c4p0 {
    public static class star  {
        int x, y, m;
        public star (int x, int y, int m) {
            this.x = x;
            this.y = y;
            this.m = m;
        }
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        int R = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        star star1 = new star(sc.nextInt(), sc.nextInt(), sc.nextInt());
        star star2 = new star(sc.nextInt(), sc.nextInt(), sc.nextInt());
        star star3 = new star(sc.nextInt(), sc.nextInt(), sc.nextInt());
        if (distance(X,Y,star1,R) && distance(X,Y,star1,R) && distance(X,Y,star1,R)) System.out.println("What a beauty!");
        else System.out.println("Time to move my telescope!");
    }
    static boolean distance (int x1, int y1, star star, int r) {
        return (r>Math.pow(x1-star.x, 2) + Math.pow(y1-star.y, 2));
    }
    static void min (star a, star b, star c) {
        int temp =  Math.min(Math.min(a.m,b.m), c.m);
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader(InputStream x) {
            br = new BufferedReader(new
                    InputStreamReader(x));

        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
