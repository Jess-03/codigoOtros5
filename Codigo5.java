package com.generation;

//Se importó la clase scanner
import java.util.Scanner;

//Se añadió main
public static void main(String[] args) {

	public class Codigo5 {

		// se añadió system.in para que se pueda mostrar en consola
			 Scanner s = new Scanner(System.in);
		 
		 	//Se gregó las comillas faltantes
			    
			 System.out.println("Introduzca un número: ");
			 int ni = s.nextLine();
			    
			 int c = ni;
			    //Se cambió el nombre de las variables
			    int afortunado = 0;
			    int noAfortunado = 0;
			    
			    while (ni > 0) {
				  int digito = (int)(ni % 10);
			      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
					afortunado++;
			      } else {
					noAfortunado++;
				  
				  ni /= 10;
			    }

			    if (afortunado > noAfortunado) {
			    	//Faltaba una t en print
			      System.out.println("El " + c + " es un número afortunado.");
			    } else {
			      System.out.println("El " + c + " no es un número afortunado.");
			    }
			    
			  
			}
      	}
    }
}
