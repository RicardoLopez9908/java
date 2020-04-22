package entregable;

class Lavarropa
{
// variables de instancia
private String tipo;
private int programas;
private int capacidad;
private boolean aguaCaliente;
private boolean mediaCarga;

//getter_tipo:
public String GetTipo() {
return this.tipo;
}
//getter_programas:
public int GetProgramas() {
return this.programas;
}
//getter_capacidad:
public int GetCapacidad() {
return this.capacidad;
}
//getter_aguaCaliente:
public boolean GetAguaCaliente() {
return this.aguaCaliente;
}
//getter_mediaCarga
public boolean GetmediaCarga() {
return this.mediaCarga;
}

//************************************************************************************************

//setter_tipo:
public void SetTipo(String f) {
	String Automatico="automatico";
	String semiAutomatico="semiautomatico";
	String c= f.toLowerCase();
	
	if (c.equals(Automatico)){
		if(11<this.programas &&
		   this.capacidad <19 &&
		   this.capacidad>4) {
			this.tipo=c;}
		else {throw new RuntimeException("el tipo "+ f + " ingresado no coincide con las caracteristicas de este lavarropas");}}
	if (c.equals(semiAutomatico)){
		if(this.programas<10 &&
		   this.capacidad==5){
			this.tipo=c;}
		else {throw new RuntimeException("el tipo "+ f + " ingresado no coincide con las caracteristicas de este lavarropas");}}
	else{throw new RuntimeException("el tipo "+ f + " ingresado no existe");}
}

//setter_programas:
public void SetProgramas(int c) {
this.programas=c;
}

//setter_capacidad:
public void SetCapacidad(int c) {
if(c>4) {this.capacidad=c;}
else {throw new RuntimeException("no tenemos disponibles lavarropas con capacidades menores a 5 kg");}}


//setter_aguaCaliente:
public void SetAguaCaliente(boolean c) {
String automatico="automatico";
if(c==true) {
	if(this.mediaCarga=true && this.tipo.equals(automatico)){
		this.aguaCaliente=c;}
	else{throw new RuntimeException("el tipo de lavarropas no soporta agua caliente en estas condiciones");}}
else {this.aguaCaliente=c;}
}

//setter_mediaCarga
public void SetmediaCarga(boolean c) {
this.mediaCarga=c;
}
}
