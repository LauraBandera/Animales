package daw.Laura;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
	}
	
	public void llamar(Animal pet) {
		pet.despertar();
	}
	
	public void alimentar(Animal pet, double cantidadGramos) {
		pet.comer(cantidadGramos);
	}
	
	public void jugar(Animal pet, int cantidadMinutos) {
		if(cantidadMinutos > 180) {
			throw new IllegalArgumentException ("Valor introducido no válido");
			//cantidadMinutos = 180;
		}
		cantidadMinutos = 180;
		pet.jugar(cantidadMinutos);
	}
}
