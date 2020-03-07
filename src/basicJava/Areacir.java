package basicJava;

import java.util.Scanner;

public class Areacir {

	public static void main(String[] args) {
		// calculate area of a circle
		double r;
		double pi=3.14;
		Scanner scanner=new Scanner(System.in);
		double area;
		System.out.println("enter the radius of a circle");
		r=scanner.nextDouble();
		scanner.close();
		area=pi*r*r;
		System.out.println("The area of a circle is"+area);
		
		
		
		

	}

}
