
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		try {
		    
			float x = scan.nextInt(), y = scan.nextInt();
			
			System.out.println(x / y);
		}
		
		catch(Exception e) {
		    
			System.out.println(e.getClass().toString().substring(10));
			System.out.println(e);
		}
	}
}
