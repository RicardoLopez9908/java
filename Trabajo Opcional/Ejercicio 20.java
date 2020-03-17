package hola;
import java.util.Scanner;  
public class TrabajoOpcional {
	/**Escribir el metodo static boolean esCapicua(String s) que dada una cadena, devuelve true
	si la cadena es igual de atras hacia adelante o de adelante hacia atras. En caso contrario, devuelve
	false.*/
	
	public static boolean esCapicua(String s) {
	String palabra= s;
	int cantChars = palabra.length()/2;
	for (int i =0 ; i <= cantChars; i ++  ) {
		if (palabra.charAt(i) != palabra.charAt(palabra.length()-i)) {
			return false;
		}}
	
	return true;
	}

	public static void main(String[] args) {
		Scanner sn =new Scanner (System.in);
		System.out.println("ingrese una palabra para verificar que sea o no capicua");
		
		if (esCapicua(sn.nextLine()==true){
			System.out.println("la palabra es capicua");}
		else {
			System.out.println("la palabra no es capicua");
		}
		
		
	}	// TODO Auto-generated method stub
}

