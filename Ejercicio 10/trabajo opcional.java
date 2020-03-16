package hola;
import java.util.Scanner;  
public class TrabajoOpcional {
	
	
			/**Ejercicio 10
	Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de los numeros desde 1 hasta n.*/

	public static int sumatoria(int n) {  				 //CREAMOS FUNCION "SUMATORIA"
		int numero = n;                    				 //DEFINIMOS LA VARIABLE INGRESADA COMO "NUMERO"	
		int contador=0;									 //PONEMOS NUESTRO CONTADOR EN 0 (DONDE GUARDAREMOS EL RESULTADO FINAL) 
		for (int i=1 ;i <= numero ; i++) {				 //HACEMOS QUE SE VERIFIQUE QUE MIENTRAS "I" SEA MENOR A EL NUMERO CONTINUE LA OPERACION
			contador=contador+i;}						 //REALIZAMOS LA SUMATORIA EN "CONTADOR
		return contador;								 //DEVOLVEMOS EL RESULTADO
	}
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);													
		System.out.println("ingrese un numero para realizar la sumatoria");				//PEDIMOS UN NUMERO AL USUARIO
		System.out.println("la sumatoria arroja " +sumatoria(sn.nextInt())+" como resultado final" );		//USAMOS EL NUMERO PARA HACER UN LLAMADO A LA FUNCION CREADA
		
	}

}
