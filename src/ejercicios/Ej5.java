package ejercicios;

import java.util.Scanner;

public class Ej5 {
	
	public static void main(String[] args) {
		//Objeto tipo scanner
		Scanner sc=new Scanner(System.in);
		
		int trimestre1,trimestre2,trimestre3,media;
		
		
		System.out.println("");
		trimestre1=sc.nextInt();
		
		
		System.out.println("");
		trimestre2=sc.nextInt();
		
		
		System.out.println("");
		trimestre3=sc.nextInt();
		
		
		media=(trimestre1+trimestre2+trimestre3)/3;
		
		System.out.println(media);
		
		
		sc.close();
		
	}
}
