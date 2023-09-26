package ejercicios;

import java.util.Scanner;

public class Ej4 {
	
	
	
	public static void main(String[] args) {
		
		//Objeto tipo scanner
		Scanner sc=new Scanner(System.in);
				
		boolean llueve,biblioteca,tareaTerminada,salir;
		System.out.println("Escribe true o false según si ocurre esto o no: ");

		System.out.println("Está lloviendo?: ");
		llueve=sc.nextBoolean();

		System.out.println("HICISTES LA TAREA?: ");
		tareaTerminada=sc.nextBoolean();

		System.out.println("VAS A LA BIBLIOTECA?: ");
		biblioteca=sc.nextBoolean();
		
		
		salir=biblioteca||(!llueve&&tareaTerminada);
		
		System.out.println(salir);
		
		
	}
}
