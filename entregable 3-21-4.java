package entregable;

class JugadaGenerala
{
// Variables de instancia
private int[] dados;
private boolean escalera;
private boolean poker;
private boolean generala;
private int puntos;
int cantidadAp(int[] a, int n);

//getter_dados:
public int[] GetDados() {
return this.dados;
}

//getter_escalera:
public boolean GetEscalera() {
	SetEscalera();
	return this.escalera;
}
//getter_poker:
public boolean GetPoker() {
	SetPoker();
	return this.poker;
}
//getter_generala:
public boolean GetGenerala() {
	SetGenerala();
	return this.generala;
}
//getter_puntos
public int GetPuntos() {
	this.puntos=0;
	SetEscalera();
	SetPoker();
	SetGenerala();
	return this.puntos;
}

//********************************************************************************

//setter_dados:
public void SetDados(int[] c) {
	dados=new int[4];
	for(int i=0;i<=4;i++) {
		if(i >6 || i<1 ) {throw new RuntimeException("el numero debe ser un entero entre 1 a 6");}
		else{this.dados[i]=c[i];}
		}}

//setter_escalera:
/**los dados deberan quedar del 1 al 5 o del 2 al 6. Otorga 20 puntos.*/
private void SetEscalera() {
	int contador=0;
	for(int i=0;i<4;i++) {
		if(cantidadAp(this.dados,i+1)==1){
			contador=contador+1;}
		else {contador=0;}}
	for(int i=0;i<4;i++) {
		if(cantidadAp(this.dados,i+2)==1) {
			contador=contador+1;}}
	if(contador==5) {
		this.escalera=true;
		this.puntos=20;}}





//setter_poker:
/**Cuatro dados iguales y uno distinto. Otorga 40 puntos.*/
private void SetPoker() {
	for(int i=1;i<=6;i++){
		if(cantidadAp(this.dados,i)==4){
			this.generala=true;
			this.puntos=40;}}
}




//setter_generala:
/**Cinco dados iguales. Otorga 50 puntos.*/
private void SetGenerala() {
for(int i=1;i<=6;i++){
	if(cantidadAp(this.dados,i)==5){
		this.generala=true;
		this.puntos=50;}}

}



}

