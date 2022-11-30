package bb;
import java.util.Scanner;
import java.util.ArrayList;

public class Name {
	public static void main(String[] args) {
		
		
		ArrayList<String> days = new ArrayList<String>();
    	Scanner scan = new Scanner (System.in).useDelimiter("\\n");
    	Scanner sken = new Scanner(System.in);
    //     String mon;
    	
    	for(int i=0; i<1; i++) {
    		System.out.println("A,B,C,D,E");
    	}
    	
//    	System.out.print(days);
//    	System.out.println();
//    	String value;
//    	int num;
//    	
//    	System.out.print("Enter index: ");
//    	num = sken.nextInt();
//    	System.out.print("Enter value: ");
//    	value = scan.next();
//
//    	
//    	days.set(num,value);
//    	System.out.print(days);
    	
    	System.out.print(" Enter position to be removed:  ");
    	int m=0;
    	for (int j=1; j<2; j++) {
    		m=sken.nextInt();
    		days.remove(m);
    		
    		System.out.print(days);
	}
	}
}