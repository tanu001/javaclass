package basicJava;

import java.util.Scanner;

public class Lengthname {

	public static void main(String[] args) {
		// print length of your name
		System.out.println("enter your name");
		Scanner scanner = new Scanner(System.in);
		String name= scanner.nextLine();
		System.out.println("my name is :"+name);
		System.out.println("the length of my name is:"+name.length());
		scanner.close();
		

	}

}
