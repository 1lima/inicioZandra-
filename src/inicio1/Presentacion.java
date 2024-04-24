package inicio1;

import java.util.Arrays;
import java.util.Scanner;

//Para mañana realizar un algoritmo que permita introducir una frase 
//por teclado y nos cree un array con las palabras de la frase.


public class Presentacion {
	public static void main(String[]arg) {
		
		Scanner ent = new Scanner(System.in);
		
		//String frase = ent.nextLine();
		String frase = "";
		String[] palabras;
		final char ESPACIO = (char)32;
		int size=1;
		System.out.println("Introduce unafrase");
		frase=ent.nextLine();
		
		if(!frase.isBlank()) {
		for (int i=0; i<frase.length();i++) {
			if(frase.charAt(i)==ESPACIO) {
				size++;
			}
		}
			System.out.println("La frase tiene " + size + " palabras");
		}else {
			System.out.println("LA frase no tiene palabras");
		}
		palabras=new String[size];
		
		rellenarArray(frase,palabras); // la segunda es el array - palabras
				
	}
		public static void rellenarArray(String cadena, String[] listaPalabras) {
			final char ESPACIO = (char)32;
			int posArray=0, posUltimaPalabra=0;
			for(int i=0; i < cadena.length(); i++) {
				if(cadena.charAt(i) == ESPACIO) {
					listaPalabras[posArray] = cadena.substring(posUltimaPalabra,i);
					posArray++;
					posUltimaPalabra = i+1;
				}
			}
			listaPalabras[posArray] = cadena.substring(posUltimaPalabra,cadena.length());
			System.out.println("Pos Array " + posArray + " pos ultima palabra " + posUltimaPalabra);
			System.out.println(Arrays.toString(listaPalabras));
		}
		
}