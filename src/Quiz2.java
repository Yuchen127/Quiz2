import java.util.Scanner;
import java.lang.Math;
public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		
		int InitialCost;
		double PercentIncrease;
		double RepaymentYears;
		double APR;
		
			
		System.out.print("Enter your InitialCost:");
		InitialCost = user_input.nextInt();
		System.out.println("");
		
		System.out.print("Enter your PercentIncrease:");
		PercentIncrease = user_input.nextFloat();
		System.out.println("");
		
		System.out.print("Enter your RepaymentYears:");
		RepaymentYears = user_input.nextFloat();
		System.out.println("");
		
		System.out.print("Enter your APR:");
		APR = user_input.nextFloat();
		System.out.println("");
		
		double Total_Cost = InitialCost*(1+PercentIncrease) * 4;
					
		System.out.printf("The total cost is: %d\n"+Total_Cost);
		
		double MonthlyPay = Total_Cost*(1-(Math.pow(APR,RepaymentYears)))/(1-RepaymentYears)/RepaymentYears/12;
		
		System.out.printf("The Monthly payment is: %f\n"+MonthlyPay);
		
	}

}
