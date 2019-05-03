package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class frc_robotics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is the initial value (P)? ");
		double initial_value = Double.parseDouble(br.readLine());
		System.out.println("What is the compound rate (R) ");
		double compound_rate = Double.parseDouble(br.readLine());
		System.out.println("How many years do you plan on investing it for(n)");
		int number_of_years = Integer.parseInt(br.readLine());
		System.out.println("The future value of the investment is $" + Math.pow(1 + (compound_rate/100), number_of_years) * initial_value);
	}
}
