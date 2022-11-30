package gawapa2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class gwapaq {
	public static void main(String[] args) {
		ArrayList<String> day = new ArrayList<String>();
		ArrayList<String> mon = new ArrayList<String>();

		Scanner sc = new Scanner (System.in);
    	Scanner aa = new Scanner(System.in);
		
    	for (int i=0; i<7; i++) {
    		System.out.print("Enter the Days in a Weeek: ");
    		day.add(i,sc.next());
    	}
		System.out.println(day);
		System.out.println();
    	
		for (int x=0; x<5; x++) {
    		System.out.print("Enter 5 names of month: ");
    	    mon.add(x,aa.next());
		}
    	    System.out.println(mon);
    	    System.out.println();
    	
		
		System.out.println("Enter the index number to removea day. ");
		System.out.println();
		System.out.println("remove days: "); 
		int w=3;

		for (int i=0; i<3; i++) {
			w=aa.nextInt();
			day.remove(w);	
			System.out.println(day);
		}
		
		System.out.println("number of element : " +day.size()+ mon.size());
	    	System.out.print("sorted: ");
	Collections.sort(day);
	for (String str: day) {
		    		System.out.println(str);
		    		Collections.sort(mon);
		    		for (String str1: mon) {
		    			    		System.out.println(str1);
		    		}
  		
  		}
	}
}