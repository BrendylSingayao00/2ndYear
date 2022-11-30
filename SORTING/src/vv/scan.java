package Gwapako;
import java.util.Scanner;

public class Gwapako{
	public static void main(String[] args) {
		
		Scanner Love =new Scanner (System.in);
		int sum= 0;
		int dif=0;
		int divission=0;
		int multiplt=0;
		System.out.print("enter number first number : ");
		int num1 = Love.nextInt();
		System.out.print("enter number first number : ");
		int num2 = Love.nextInt();
		sum = num1+num2;
		System.out.println("Sum:  "+sum);
		dif= num1-num2;
		System.out.println("Sub:  "+dif);
		divission= num1/num2;
		System.out.println("div:  "+divission);
		multiplt= num1*num2;
		System.out.println("mult:  "+multiplt);
		
	}
}