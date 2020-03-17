package hola;
import java.util.Scanner;  
public class TrabajoOpcional {
	/**Escribir un metodo static int cantidadVocales(String s) que dada una cadena que contiene
	solo letras minusculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
	utilizar el metodo definida en el ejercicio anterior.*/
	
	public static String cantidadVocales(String s) {
		String palabra= s;
		int contador = 0;
		for (int i=0; i <= palabra.length(); i++) {
			if (palabra.charAt(i)=='a' 
			  ||palabra.charAt(i)=='e'
			  ||palabra.charAt(i)=='i'
			  ||palabra.charAt(i)=='o'
			  ||palabra.charAt(i)=='u') {
					contador++;}
		return contador;			
		}
		
	}
	
	public static void main(String[] args) {
	
		Scanner sn =new Scanner (System.in);
		System.out.println("ingrese una palabra");
		System.out.println("tiene un total de "+cantidadVocales(sn.nextLine()+" vocales"));
		// TODO Auto-generated method stub
		}

}
