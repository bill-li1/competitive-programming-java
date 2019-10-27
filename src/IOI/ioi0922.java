package src.IOI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ioi0922 {

    static class Point {
        public int row;
        public int col;
        public int time;

        public Point(int r, int c, int t) {
            row = r;
            col = c;
            time = t;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int S = sc.nextInt();
        char[][] map = new char[N][N];
        for (int i=0; i<N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }
        /*
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        */
        int[][] step = new int[N][N];
        int big = S*N*N;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                step[i][j] = big;
            }
        }
        int br = -1, bc = -1;
        Queue<Point> arraylist = new LinkedList<Point>();
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (map[i][j]=='M') {
                    br = i;
                    bc = j;
                }
                if (map[i][j]=='H') {
                    step[i][j] = 0;
                    arraylist.add(new Point(i,j,0));
                }
            }
        }
        int[][] ds = {{-1,0},{0,-1},{0,1},{1,0}};
        while (!arraylist.isEmpty()) {
            Point current = arraylist.remove();
            for (int[] d : ds) {
                int nextrow = current.row+d[0];
                int nextcol = current.col+d[1];
                int nexttime = current.time+S;
                if (0 <= nextrow && 0 <= nextcol && nextrow < N && nextcol < N &&
                        (map[nextrow][nextcol]=='M' || map[nextrow][nextcol]=='G') &&
                        step[nextrow][nextcol] >= big) {
                    step[nextrow][nextcol] = nexttime;
                    arraylist.add(new Point(nextrow, nextcol, nexttime));
                }
            }
        }
        int low = 0;
        int high = N*N;
        boolean[][] visited = new boolean[N][N];
        while(low<=high) {
            int mid = (low+high)/2;
            int starttime = S*mid;
            if (starttime >= step[br][bc]) {
                high = mid-1;
                continue;
            }

            arraylist.clear();
            arraylist.add(new Point(br,bc,starttime));

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    visited[i][j] = false;
                }
            }

            boolean flag = false;
            while (!arraylist.isEmpty()) {
                Point current = arraylist.remove();
                if (map[current.row][current.col]=='D') {
                    flag = true;
                    break;
                }
                for (int[] d : ds) {
                    int nextrow = current.row+d[0];
                    int nextcol = current.col+d[1];
                    int nexttime = current.time+1;
                    if (0 <= nextrow && 0 <= nextcol && nextrow < N && nextcol < N &&
                            (map[nextrow][nextcol]=='G' || map[nextrow][nextcol]=='D') &&
                            !visited[nextrow][nextcol] && nexttime < step[nextrow][nextcol]) {
                        visited[nextrow][nextcol] = true;
                        arraylist.add(new Point(nextrow,nextcol,nexttime));
                    }
                }
            }
            if (flag) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        System.out.println(low-1);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
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
