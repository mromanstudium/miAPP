package prueba;

public class Coche {
	
	//Atributos
	String marca;
	String color;
	Double precio;
	
	//Constructor por defecto (sin parámetros)
	public Coche() {
		marca="seat";
		color="rojo";
		precio=0.0;
	}
	//Constructor por parámetros
	public Coche(String m, String c, Double p) { //opel,azul, 1500.0
		marca=m;
		color=c;
		precio=p;
	}
	
	
	//Métodos (acelerar=10 y frenar)
	int acelerar() {
		return 10; 
	}
	
	String frenar() {
		return "El coche está frenando";    
	}
	
	
}
