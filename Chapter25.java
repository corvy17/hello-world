import java.util.Scanner;

public class Chapter25 {
	public static void main(String[] args) {
		/*2.5*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		System.out.print("Enter the gratituity rate: ");
		double gratituity = input.nextDouble();
		double caculateGratuity = (gratituity) / subtotal;
		double total = subtotal + caculateGratuity ;
		System.out.println(" The Gratuity is : $" +  caculateGratuity  + " and total is : $" + total);
		
		
		/*2.20*/
		/*2.23*/
	}
}