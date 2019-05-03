package Other;

import java.util.Scanner;

public class boolean_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = S.split(" ");
        if (arr.length%2==1) {
            System.out.println(arr[arr.length-1]);
        } else {
            if (arr[arr.length-1].equals("True")) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        }
    }
}
