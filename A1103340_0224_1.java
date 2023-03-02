import java.util.Scanner;

public class work{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("please Enter a Integer\n");
		int num=input.nextInt();
		if(num%2==0){
			System.out.print("This is a even");
		}
		else{System.out.print("This is a odd");}
	} 
}