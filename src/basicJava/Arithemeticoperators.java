package basicJava;

import java.util.Scanner;

public class Arithemeticoperators {
	
	//calculator application that does addition, multiplication, subtraction and division of two numbers
		
		int sum,sub,multi,div;
		void add(int a,int b)
		{
			sum=a+b;
		}	
	
		void subtraction(int a, int b)
		{
			sub=a-b;
		}
	
		void multiplication(int a, int b)
		{
			multi=a*b;	
		}
	
		void division( int a, int b)
		{
			div=a/b;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
System.out.println("enter the first number:");
int a= scanner.nextInt();
System.out.println("enter the second number:");
int b = scanner.nextInt();

Arithemeticoperators add1= new Arithemeticoperators();
add1.add(a, b);
System.out.println(" the addition of two numbers:"+add1.sum);
add1.subtraction(a,b);
System.out.println(" the subtraction of two numbers:"+add1.sub);
add1.multiplication(a, b);
System.out.println(" the multiplication of two numbers:"+add1.multi);
add1.division(a, b);
System.out.println(" the division of two numbers:"+add1.div);
scanner.close();
		
		
		
	}

}
