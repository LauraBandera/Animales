package daw.Laura;

public class Persona {

	//Atributos
	private String nombre;
	private int edad;
	
	//Constructor con parámetros
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//Constructor por defecto 
	public Persona() {
		super();
	}
	
	//Métodos de la clase
	public void llamar(Animal pet) {
		pet.despertar();
	}
	
	public void alimentar(Animal pet, double cantidadGramos) {
		pet.comer(cantidadGramos);
	}
	
	public void jugar(Animal pet, int cantidadMinutos) {
		try {
			pet.jugar(cantidadMinutos);
		}catch (IllegalArgumentException iae) {
			pet.jugar(180);
		}
		
		/*//hay que capturar también la excepción.
		if(cantidadMinutos > 180) {
			cantidadMinutos = 180;
			throw new IllegalArgumentException ("Valor introducido no válido");
			//cantidadMinutos = 180;
		}
		pet.jugar(cantidadMinutos);
		*/
	}
}
