package cc;
import java.util.*;
import java.util.Scanner;


public class mm {
	public static void main(String[] args) {
    	
    	ArrayList<String> numbers = new ArrayList<String>();
    	Scanner sken = new Scanner(System.in);
    	
        numbers.add("bren");
        numbers.add("mon");
        numbers.add("dave");
        numbers.add("shy");
        numbers.add("lo");
        numbers.add("fee");       
        
        for (String str: numbers)
        	System.out.println(str);
        System.out.print("Number of names: ");
        System.out.println(+numbers.size());


	}
}