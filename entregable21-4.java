package etregable;

class FichaDomino{
	//variables de instancia:
private int numero_1;
private int numero_2;

//getter_1:
public int getnumero_1(){
	return this.numero_1;
 }
 //getter_2:
public int getnumero_2(){
	return this.numero_2;
	 }
//setter_1:
public void setnumero_1(int c) {
	if(0<=c && c<=6) {
		this.numero_1=c;}
	else{throw new RuntimeException("el numero "+c+" es invalido");}
}
//setter_2:
public void setnumero_2(int c) {
	if(0<=c && c<=6) {
		this.numero_2=c;}
	else{throw new RuntimeException("el numero "+c+" es invalido");}
}

}

