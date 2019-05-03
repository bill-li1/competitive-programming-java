package dmoj_contest;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class dmopc18c5p0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mode = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        float r1 = Float.parseFloat(st.nextToken());
        float g1 = Float.parseFloat(st.nextToken());
        float b1 = Float.parseFloat(st.nextToken());
        st = new StringTokenizer(br.readLine());
        float r2 = Float.parseFloat(st.nextToken());
        float g2 = Float.parseFloat(st.nextToken());
        float b2 = Float.parseFloat(st.nextToken());
        if (mode.equals("Multiply")) {
            System.out.print(String.format("%.6f",r1*r2) + " ");
            System.out.print(String.format("%.6f",g1*g2) + " ");
            System.out.print(String.format("%.6f",b1*b2) + " ");
        } else if (mode.equals("Screen")) {
            System.out.print(String.format("%.6f",1-(1-r1)*(1-r2)) + " ");
            System.out.print(String.format("%.6f",1-(1-g1)*(1-g2)) + " ");
            System.out.print(String.format("%.6f",1-(1-b1)*(1-b2)) + " ");
        } else {
            overlay(r1,r2);
            overlay(g1,g2);
            if (b1<0.5) {
                System.out.print(String.format("%.6f",2*b1*b2));
            } else {
                System.out.print(String.format("%.6f",1-2*(1-b1)*(1-b2)));
            }
        }
    }
    public static void overlay (float a, float b) {
        if (a<0.5) {
            System.out.print(String.format("%.6f",2*a*b) + " ");
        } else {
            System.out.print(String.format("%.6f",1-2*(1-a)*(1-b)) + " ");
        }
    }
}
