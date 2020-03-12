package cal;

import java.util.Scanner;


public class Ejercicio1 {

	/*
	 *  Implementar la funcion cantDivisores que tome un parametro de tipo entero y calcule la cantidad de divisores de ese entero. (*)
	b) Hacer un programa que use la funcion anterior.
	c) Averiguar cuantos divisores tienen los siguientes numeros: 45, 2374 y 3529.
	 * 
	 */
	
	public static int calcularDivisores(int param){
		
		
		int cantidadDivisores=0;
		for(int i=1; i<=param; i++){
			
			if(param%i == 0){
				cantidadDivisores++;
			}
			
		}
		
		System.out.println("El numero " + param + " tiene " + cantidadDivisores + " divisores");
		
		return cantidadDivisores;
	}
		
		
	public static boolean esPrimo (int num){
			
			
		if(calcularDivisores(num)==2){
			return true;
		}else return false;
			
		
		
	}
	
	
	public static int siguientePrimo (int n){
		
		int num=n++;
		
		boolean esPrimo = false;
		
		while(esPrimo == false){
		
			num++;
			esPrimo = esPrimo(num);
			
		}
		
		return num;
				
	}
	
		
	public static int factorial (int n){
		
		int result=1;
		
		for(int i=1; i<=n; i++){
			
			result*=i;
			
			
		}
		
		return result;
				
	}
		
		
	
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un nùmero");
		
		int numero=scan.nextInt();
		
		//calcularDivisores(numero);
		System.out.println(factorial(numero));
		
	}

}
