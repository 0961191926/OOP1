import java.util.Scanner;

public class A1103340_0224_2{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("enter a temperature(C)\n");
		double num=input.nextDouble();
		System.out.printf("the temperature is %.2f(F)",(num*9/5)+32);
	} 
}