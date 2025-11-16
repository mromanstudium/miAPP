package prueba;

public class Persona {

	//Atributos: nombre,edad, altura
	String nombre;
	int edad;
	double altura;
	String dni;
	
	//Constructor por defecto
	public Persona() {
		nombre="";
		edad=0;
		altura=0.0;
	}
	//Constructor con parámetros
	public Persona(String n, int e, double a) { //paco, 45, 1.75
		nombre=n;
		edad=e;
		altura=a;
	}
	
	//inspectores y modificadores
	//nombre
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setEdad() { //void = no devuelve nada
		edad = 0;
	}
	public void setEdad(int i) { //void = no devuelve nada
		edad = i;
	}
	public void setNombre(String n1) {
		nombre = n1;
	}
	public void setAltura(double al) {
		altura = al;
	}
	
}
