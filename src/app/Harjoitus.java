package app;
import java.util.Scanner;
public class Harjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 

		String input; 

		System.out.println("Kirjoita 1. numero"); 
		int n1 = Integer.parseInt(in.nextLine()); 
		 
		System.out.println("Kirjoita 2. numero"); 
		int n2 = Integer.parseInt(in.nextLine()); 
		
		int minus =n1-n2; 
		int sum =n1+n2; 
		 

		System.out.println("Haluatko laskea luvut yhteen vai vähentää. Kirjoita plus tai miinus"); 
double tulos = 0;

		String lasku = in.nextLine();
		if (lasku.equalsIgnoreCase("plus"))
		{
			tulos = n1+n2;
		}
		else if (lasku.equalsIgnoreCase("miinus"))	
		{
			tulos = n1-n2;
		}

		if(sum > 10) 

		{ 

		System.out.println("Tulos on yli 10. Tulos on " + sum);		 

		} 

		else 

		{ 

		System.out.println("Tulos on " + sum + "."); 
		
	}

}
}
