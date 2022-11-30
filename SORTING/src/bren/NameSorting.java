package bren;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class NameSorting {

    public static void main(String[] args) {
    	
    	ArrayList<String> days = new ArrayList<String>();
    	Scanner scan = new Scanner (System.in).useDelimiter("\\n");
    	Scanner sken = new Scanner(System.in);
    	 String mon;
    	
    	for(int i=0; i<7; i++) {
    		System.out.print("Enter Day: ");
    		days.add(i,scan.next());
    	}
    	
    	System.out.print(days);
     	System.out.println();
    	String value;
    	int num;
    	
    	System.out.print("Enter index: ");
    	num = sken.nextInt();
    	System.out.print("Enter value: ");
    	value = scan.next();

    	
    	days.set(num,value);
    	System.out.print(days);
    	
    	System.out.print(" Enter position to be removed:  ");
    	int l=0;
    	for (int j=1; j<4; j++) {
    		l=sken.nextInt();
    		days.remove(l);
    		
    		System.out.print(days);
    	
     	int m;
    	String value2;
    	
    	System.out.print("Enter position : ");
    	m= sken.nextInt();
    	System.out.print("Enter value: ");
    	value2= scan.next();

    	days.set(m, value2);
    	System.out.print(days);
    	
    	
    		    	System.out.print("sorted: ");
    	Collections.sort(days);
    	for (String str: days) {
    		    		System.out.println(str);

    	}
    	
    	
    	}
    	
    	
}
    
}