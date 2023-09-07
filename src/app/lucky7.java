package app;
import java.util.Scanner;
import java.util.Random;
public class lucky7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        Random random = new Random();				
        System.out.println("Lucky7");
        
int n1 = 0;
int n2 = 0;
int n3 = 0;
System.out.println("Syötä rahamäärä");
int rahat = Integer.parseInt(in.nextLine());

while (rahat > 0) {
	rahat--;
	n1 = random.nextInt(10) + 1;
	n2 = random.nextInt(10) + 1;
	n2 = random.nextInt(10) + 1;
	if(n1 == 7 && n2 == 7 && n3 ==7) {
		rahat = rahat + 10;
		System.out.println("Sait numerot " + n1 + ", " + n2 + " ja " + n3 + ". Voitit pelin ja sait 10 rahaa");
		System.out.println("Rahaa jäljellä " + rahat);
	}
	else if(n1 == 7 && n2 == 7 || n2 == 7 && n3 == 7 || n1 == 7 && n3 == 7) {
		rahat = rahat + 5;
		System.out.println("Sait numerot " + n1 + ", " + n2 + " ja " + n3 + ". Voitit pelin ja sait 5 rahaa");
		System.out.println("Rahaa jäljellä " + rahat);
	}
	else if(n1 == 7 || n2 == 7 || n3 == 7) {
		rahat = rahat + 3;
		System.out.println("Sait numerot " + n1 + ", " + n2 + " ja " + n3 + ". Voitit pelin ja sait 3 rahaa");
		System.out.println("Rahaa jäljellä " + rahat);
	}else {
		System.out.println("Sait numerot " + n1 + ", " + n2 + " ja " + n3 + ". Hävisit pelin");
		System.out.println("Rahaa jäljellä " + rahat);
	}
	System.out.println("Haluatko pelata uudestaan?");
	System.out.println("Jos haluat pelata, paina Enter");
	System.out.println("Jos et halua pelata kirjoita en");
	String vastaus = in.nextLine();
	if(vastaus.equals("en")) {
		System.out.println("Peli päättyi, Sinulle jäi " + rahat + " euroa");
		System.exit(0);		
		
	}
	
		
	}
}
	

	    
	    	
	    	
	   	 }    	            			

