package cal;

import java.util.Scanner;

/*Ejercicio 18 F
Escribir un m´etodo static int cantidadVocales(String s) que dada una cadena que contiene
s´olo letras min´usculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
utilizar el m´etodo definida en el ejercicio anterior.
*/
public class Ejercicio1 {

	
	public static boolean noEsAbc(String w){
		
		String word = w;
		int cantidadChars = word.length();
		
		for(int i=1; i<cantidadChars; i++){
			
			if(word.charAt(i) < word.charAt(i-1)){
				
				return false;
				
			}
			
		}
		
		
		
		
		return true;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(noEsAbc("abc"));

		
		
		
		
	}

}
