import java.util.Scanner;

public class vacation {

	public static void main(String[] args) {
		/* Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget. There
		should be two options – Beach, Mountain. If the user put a different value then the program should print a message that there is
		no information about this type of vacation. Budgets are considered per day per person. If the budget per day for Beach type
		vacation is smaller than 50 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget
		per day for Mountain type vacation is smaller than 30 then the program should advise Bulgaria as a destination, otherwise
		Outside Bulgaria */
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose destination: beach or mountain (use only lowercase letters): ");
		String destination = scan.nextLine();
		if (!destination.equals("beach") && !destination.equals("mountain")){
			System.out.println("There is no information about this type vacation");
			System.exit(0);
		}
		System.out.println("specify your daily budget:");
		int budgetPerDay = scan.nextInt();
		if (budgetPerDay <= 0) {
			System.out.println("Invalid data entered");
			System.exit(0);
		}
		
		
		if (destination.equals("beach")) {
		if(budgetPerDay < 50) {
			System.out.println("You can afford a beach holiday in Bulgaria");
			System.exit(0);
		}
			
		
		else if (budgetPerDay >= 50){
			System.out.println("You can afford a beach holiday outside Bulgaria");
			System.exit(0);
		}

	}
		if (destination.equals("mountain")) {
			if(budgetPerDay < 30) {
				System.out.println("You can afford a mountain holiday in Bulgaria");
				System.exit(0);
			}
				
			
			else if (budgetPerDay >= 30){
				System.out.println("You can afford a mountain holiday outside Bulgaria");
				System.exit(0);

}
}
		scan.close();
	}
}