import java.util.Scanner;

public class Chapter220 {
	public static void main(String[] args) {
		/*2.20*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance: ");
		double balance = input.nextDouble();
		System.out.print("Enter interest rate: ");
		double annualInterestRate = input.nextDouble();
		double interest = balance * (annualInterestRate/1200) ;
		System.out.println(" The interest is : " + interest);
		
	
	}
}