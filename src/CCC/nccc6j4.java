package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class nccc6j4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Food[] A = new Food[4];

        A[0] = new Food("Deluxe Tuna Bitz", 0, 1);
        A[1] = new Food("Bonito Bitz", 0, 2);
        A[2] = new Food("Sashimi", 0, 3);
        A[3] = new Food("Ritzy Bitz", 0, 4);

        for (int i = 0; i < N; i++) {
            String food = sc.nextLine();

            if (food.equals("Deluxe Tuna Bitz")) {
                A[0].count++;
            } else if (food.equals("Bonito Bitz")) {
                A[1].count++;
            } else if (food.equals("Sashimi")) {
                A[2].count++;
            } else {
                A[3].count++;
            }

        }

        Arrays.sort(A);
        for (int i = 0; i < 4; i++) {
            if (A[i].count != 0)
                System.out.println(A[i].name + " " + A[i].count);
        }
    }
    public static class Food implements Comparable<Food> {

        String name;
        int count;
        int orderID;


        public Food(String n, int c, int o) {
            name = n;
            count = c;
            orderID = o;
        }

        @Override
        public int compareTo(Food o) {
            // TODO Auto-generated method stub
            if (this.count > o.count) {
                return -1;
            } else if (this.count < o.count) {
                return 1;
            } else {
                if (this.orderID < o.orderID) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }

    }
}
