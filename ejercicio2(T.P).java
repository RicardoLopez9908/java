package resolucion;

public class Punto {      
	double x;						//declaramos como double a la variable x
	double y;						//declaramos como double a la variable y

public Punto(double x,double y) {		//creamos el constructor para ingresar doubles en el punto
	this.x = x;							//las coordenadas van a ser las que le declaremos a x			
	this.y = y;}						//las coordenadas van a ser las que le declaremos a y



static void imprimir(Punto p) {								//imprimir un punto(que construimos)
	System.out.println("la coordenada x es = "+ p.x);		//imprime coordenada x
	System.out.println("la coorenada y es = "+ p.y);		//imprime coordenada y
	}

static void desplazar(Punto p,double dx,double dy) {		//desplazar coordenadas del punto
p.x= p.x+dx;					//le sumamos dx a coordenadas de x
p.y= p.y+dy;					//le sumamos dy a coordenadas de y
}
	
static double distancia (Punto p1,Punto p2) {
	double d1=(p1.x-p2.x)*(p1.x-p2.x);			//calculamos la potencia de (x1-y1)
	double d2=(p1.y-p2.y)*(p1.y-p2.y);			//calculamos la potencia de (y1-y2)
	double dFinal=Math.sqrt(d1+d2);				//calculamos la raiz cuadrada de (d1+d2)
	return dFinal;				//retornamos la distancia final
}



public static void main(String[] args) {
// TODO Auto-generated method stub
	Punto origen= new Punto(0,0); //iniciamos el punto con coordenadas en 0	
	Punto p=new Punto(3,1);			//creamos otro punto solamente para usarlo de ejemplo
	System.out.println("la distancia es de "+(distancia(origen,p)));  //imprimimos el resultado de la distancia para verificar

}}
