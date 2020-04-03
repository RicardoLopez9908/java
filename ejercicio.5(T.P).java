package resolucion;
import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
   
public Persona(String valorNombre,int valorEdad) {	//creamos un constrcutor que contenga el nombre y edad
	edad=valorEdad;
	nombre=valorNombre;}



public static boolean masJovenque(Persona otro) {   //verifica que sea mas joven o no que el parametro
	int edadParametro= 30;
	if(otro.edad<edadParametro) {
		return true;}
	else{
		return false;}}	

public static boolean tocayo(Persona otro){			//verifica que tenga el mismo nombre que el parametro
	String nombreParametro="ernesto";
	String nuevoNombre= otro.nombre.toLowerCase();
	if(nombreParametro.equals(nuevoNombre)) {
		return true;}
	else{
		return false;}}
	
public static boolean mismaPersona(Persona otro) {	//verifica que sea la misma persona que el parametro
	int edadParam=30;
	if(tocayo(otro)==true){
		if(otro.edad==edadParam){
			return true;}
		else{return false;}}
	else {return false;}}



	public static void main(String[] args) {   //a continuacion probamos las funciones
		// TODO Auto-generated method stub
		
	Scanner sn1=new Scanner(System.in);
	System.out.println("ingrese un nombre");
	String snNombre=sn1.nextLine();
	
	Scanner sn2= new Scanner(System.in);
	System.out.println("ingrese su edad");
	int snEdad=sn2.nextInt();
	
	Persona usuario=new Persona( snNombre,snEdad);
	
	System.out.println("Su nombre es = "+usuario.nombre);
	System.out.println("Su edad es de = "+usuario.edad+ "años");
	
	if(masJovenque(usuario)==true) {System.out.println("usted no es mas joven que Ernesto");}
		else{System.out.println("Ernesto es mas joven que usted");}
	if(tocayo(usuario)==true){System.out.println("usted tiene el mismo nombre que el parametro");}
		else{System.out.println("usted tiene distinto nombre que el parametro");} 
	if(mismaPersona(usuario)==true){System.out.println("usted es la persona que usamos de parametro");}
		else{System.out.println("usted no es el parametro");}
	
	}
	

	}
/**seria adecuado comparar simplemente el dni de las personas para lograr tener una respuesta rapida y precisa;Igualmente tambien podria
agregarse como un parametro mas ademas del nombre y edad para tener mayor certeza de que sea la persona correcta, como es en el
caso de las votaciones en las que se compara el nombre,apellido y dni de acuerdo a los existentes en las planillas.
