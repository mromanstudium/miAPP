package prueba;

public class Principal {
	
	public static void main(String[] args) {
		
	//Crear una persona, es decir, voy a crear un Objeto Persona
	//pepe, 25, 1.8
		
	
	//Crear objeto	
	Persona p = new Persona(); 					//por defecto
	p.setNombre("Manuel");

	
	
	Persona p2 = new Persona("pepe",25,1.8); 	//con parámetros
	Persona p3 = new Persona("Sam", 22, 1.75);
	
	System.out.print("La edad de la persona p2 es: " + p2.getEdad()); 
	
	
	p2.setEdad(); //modificador por defecto
	
	System.out.print("\nLa edad de la persona p2 es: " + p2.getEdad()); 
	
	/**System.out.print("\nEl nombre de p2 es: " + p2.getNombre()); 
	p2.setNombre("pepito");
	System.out.print("\nEl nombre de p2 es: " + p2.getNombre()); 
	
	p2.setAltura(1.82);
	
	**/
	}
}