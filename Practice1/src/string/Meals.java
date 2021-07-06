package string;

import java.util.*;


public class Meals {
	
		    // Complete the solve function below.
		    static void solve(double meal_cost, int tip_percent, int tax_percent) {
		    double tip  = meal_cost*tip_percent/100;
		    double tax  = meal_cost*tax_percent/100;    
			double meal = (int) meal_cost+tip+tax;
		        System.out.println(meal);
		        System.out.println(tip);
		        System.out.println(tax);
		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        double meal_cost = scanner.nextDouble();
		        int tip_percent  = scanner.nextInt();
		        int tax_percent  = scanner.nextInt();

		        solve(meal_cost, tip_percent, tax_percent);

		        scanner.close();
		    }

}
