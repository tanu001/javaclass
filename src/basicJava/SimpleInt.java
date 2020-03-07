package basicJava;

import java.util.Scanner;

public class SimpleInt {

	public static void main(String[] args) {
		// Calculate Simple Interest
		float p,r,t,si;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the principal");
		float principal=scan.nextFloat();
		
		System.out.println("enter the rate");
		float rate=scan.nextFloat();
		
		System.out.println("enter the time");
		float time=scan.nextFloat();
		scan.close();
		 si=(principal*rate*time)/100;
		System.out.println("The simple interest is:"+si);
		
		
		

	}

}
