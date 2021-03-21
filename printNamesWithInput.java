import java.util.Scanner;

public class printNamesWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert your first name");
		String firstName = scanner.nextLine();
		System.out.println("Insert your second name");
		String secondName = scanner.nextLine();
		System.out.println("Insert your last name");
		String lastName = scanner.nextLine();
		
		System.out.println(firstName + "\n" + secondName + "\n" + lastName);
		scanner.close();
	}

}
