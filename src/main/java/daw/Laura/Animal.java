/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Laura;

import java.time.LocalDate;

/**
 *
 * @author laura
 */
public class Animal {

    /*Información de referencia
      DateTimeFormatter
      LocalDate.of
    */
    
	//Atributos
    private LocalDate nacimiento;
    private String nombre;
    
	/*
	 * private int tipo, //1 = Gato, 2 = Perro, 3 = Lagarto, 4 = Cobaya, 5 =
	 * Periquito estado; //1 = Comiendo, 2 = Durmiendo, 3 = Despierto/reposo, 4 =
	 * Jugando
	 */

    //Cambiamos tipo y estado a enum
    private TiposAnimal tipo;
    private EstadosAnimal estado;
    
    private double peso;
    private static int contadorInstancias = 0;

    //Constructor por defecto
    public Animal() {
        this.tipo = tipo.GATO;
        this.nombre = "Turrón";
        this.peso = 2200;
        this.estado = estado.DURMIENDO;
        this.nacimiento = LocalDate.now();
        contadorInstancias++;  
    }

    //Constructor con parametros
    public Animal(LocalDate nacimiento, String nombre, TiposAnimal tipo, EstadosAnimal estado, double peso) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.peso = peso;
        contadorInstancias++;
    }
    
    //Métodos de la clase
    public void comer(double cantidadGramos) { 	
    	this.peso += Math.abs(cantidadGramos); ;
    	this.estado = estado.COMIENDO;
    }

    public void dormir() {
    	this.estado = estado.DURMIENDO;
    }
    
    public void despertar() {
    	this.estado = estado.DESPIERTO;
    }
    
    public void descansar() {
    	this.estado = estado.DESPIERTO;
    }
    
    public void jugar(int cantidadMinutos) {
    	cantidadMinutos = Math.abs(cantidadMinutos);
    	if(cantidadMinutos > 180) {
    		throw new IllegalArgumentException ("Valor demasiado grande");
    	}
    	this.estado = estado.JUGANDO;    	
    	if(cantidadMinutos > 30) {
    		this.peso -= (cantidadMinutos/30)*20;
    	}else {
    		this.peso -= 10;
    	}
    }

	@Override
	public String toString() {
		return "Animal [nacimiento=" + nacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado
				+ ", peso=" + peso + ", numAnimales=" + contadorInstancias + "]";
	}
    
    public static Animal clonar(Animal pet) {
    	if(pet == null) {
    		return new Animal();
    	}else {
        	return new Animal(pet.nacimiento, pet.nombre, pet.tipo, pet.estado, pet.peso);
    	}
    }

    //Getters
	public static int getContadorInstacias() {
		return contadorInstancias;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public static int getContadorInstancias() {
		return contadorInstancias;
	}
	
	
    
    
}
