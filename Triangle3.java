import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		/*Write a program which calculates if a triangle can be built by 3 given angles. The
angles are taken from the user input. There are two possible outputs – if the triangle
can’t be built based on the angle values or the triangle can be built based on the
angle values. If the triangle is possible the output should contain also the type of the
triangle – acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен),
equilateral (равностранен), isosceles (равнобедрен), multifaceted (разностранен)*/
		Scanner angle = new Scanner(System.in);
		System.out.println("Enterdata for angle 1");
		int angle1 = angle.nextInt();
		System.out.println("Enter data for angle 2");
		int angle2 = angle.nextInt();
		System.out.println("Enter data for angle 3");
		int angle3 = angle.nextInt();
		
		int sumOfAngles = angle1 + angle2 + angle3;
		
		
		if(sumOfAngles != 180 || angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			System.out.println("The figure is not a triangle");
			System.exit(0);
		}
		if(sumOfAngles == 180) {
			if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
					System.out.println("The triangle is right-angled and isosceles");
					System.exit(0);
				}
				else {
					System.out.println("The triangle is right-angled and multifaceted");
					System.exit(0);
				}
				
			}
			else if(angle1 > 90 || angle2 > 90 || angle3 > 90) {
				if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
					System.out.println("The triangle is obtuse-isosceles");
					System.exit(0);
				}
				else {
					System.out.println("The triangle is obtuse-multifaceted");
					System.exit(0);
				}
				
			}
			else if(angle1 < 90 || angle2 < 90 || angle3 < 90) {
				if(angle1 == angle2 && angle1 == angle3 && angle2 == angle3) {
					System.out.println("The triangle is equilateral");
					System.exit(0);
				}
				else if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
					System.out.println("The triangle is acute-isosceles");
					System.exit(0);
				}
				else {
					System.out.println("The triangle is acute-multifaceted");
					System.exit(0);
				}
			}
			
			
		}
		angle.close();
	}

}
