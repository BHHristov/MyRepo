import java.util.Scanner;

public class discountCalculate {

	public static void main(String[] args) {
		/* Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user.
		The discount rate is 15% for the quantity purchased between 100 and 120 units, and 20% for the quantity purchased greater than
		120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
		Enter unit price: 25
		Enter quantity: 110
		The revenue from sale: 2337.5$
		After discount: 412.5$(15.0%)*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit price:");
		int unitPrice = scan.nextInt();
		System.out.println("Enter the quantity:");
		int quantity = scan.nextInt();
		
		double revenue = unitPrice * quantity;
		double discount = 0;
		
		if(quantity >= 100 && quantity <= 120) {
			 discount = 0.15;
			 double totalDiscount = revenue * discount;
			 double totalRevenue = revenue - totalDiscount;
			 System.out.println("The revenue from sale is: " + totalRevenue + "lv.");
			 System.out.println("The discount is: " + totalDiscount + "lv."); 
			 System.exit(0);
		}
		if(quantity > 120) {
			 discount = 0.20;
			 double totalDiscount = revenue * discount;
			 double totalRevenue = revenue - totalDiscount;
			 System.out.println("The revenue from sale is: " + totalRevenue + "lv.");
			 System.out.println("The discount is: " + totalDiscount + "lv."); 
			 System.exit(0);
		}	 
		if(quantity < 100) {
			 discount = 0;
			 double totalDiscount = revenue * discount;
			 double totalRevenue = revenue - totalDiscount;
			 System.out.println("The revenue from sale is: " + totalRevenue + "lv.");
			 System.out.println("The discount is: " + totalDiscount + "lv."); 
			 System.exit(0);
		}
		scan.close();	
		}

	}


