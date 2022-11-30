package act1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class gwapa{
	public static void main(String[] args) {
		ArrayList<String> day = new ArrayList<String>();
		ArrayList<String> mon = new ArrayList<String>();

		Scanner sc = new Scanner (System.in);
    	Scanner aa = new Scanner(System.in);
		
    	for (int i=0; i<7; i++) {
    		System.out.print("Enter 7 Days in a Weeek: ");
    		day.add(i,sc.next());
    	}
		System.out.println(day);
		System.out.println();
    	
		for (int x=0; x<5; x++) {
    		System.out.print("Enter 5 different month: ");
    	    mon.add(x,aa.next());
		}
    	    System.out.println(mon);
    	    System.out.println();
    	
		
		System.out.println("Enter the index number to removea day. ");
		System.out.println();
		System.out.println("remove days: "); //first day to remove
		int w=0;
		for (int i=0; i<1; i++) {
			w=aa.nextInt();
			day.remove(w);			
			System.out.println(day);
		}
		
		System.out.println();
		System.out.println("remove days: ");  //2nd to remove
		int t=0;
		for (int i=0; i<1; i++) {
			t=aa.nextInt();
			day.remove(t);			
//			System.out.println(day);
		}
		System.out.println();
		System.out.println("remove days: ");   //3rd to remove
		int z=0;
		for (int i=0; i<1; i++) {
			z=aa.nextInt();
			day.remove(z);			
			System.out.println(day);
		}
//		 System.out.println("Modify 4 months name: ");
//          mon.remove(1);
//          System.out.println(mon);
		System.out.println("number of element" +day.size()+ mon.size());

	    	System.out.print("sorted: ");
	Collections.sort(day);
	for (String str: day) {
		    		System.out.println(str);
	
  		
  		}
	}
}