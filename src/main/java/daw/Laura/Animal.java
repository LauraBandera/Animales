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
    private int tipo, //1 = Gato, 2 = Perro, 3 = Lagarto, 4 = Cobaya, 5 = Periquito
            estado; //1 = Comiendo, 2 = Durmiendo, 3 = Despierto/reposo, 4 = Jugando
    private double peso;
    private static int contadorInstancias = 0;

    //Constructor por defecto
    public Animal() {
        this.tipo = 1;
        this.nombre = "Turrón";
        this.peso = 2200;
        this.estado = 2;
        this.nacimiento = LocalDate.now();
        contadorInstancias++;  
    }

    //Constructor con parametros
    public Animal(LocalDate nacimiento, String nombre, int tipo, int estado, double peso) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        if(tipo > 5 || tipo < 1) {
        	this.tipo = 1;
        	throw new IllegalArgumentException ("Valor tipo no posible (Se asigna por defecto el 1 = Gato");
        }else {
            this.tipo = tipo;
        }
        if(estado > 4 || estado < 1) {
        	this.estado = 1;
        	throw new IllegalArgumentException ("Valor tipo no posible (Se asigna por defecto el 1 = Comiendo");
        }else {
            this.estado = estado;
        }
        this.peso = peso;
        contadorInstancias++;
    }
    
    //Métodos de la clase
    public void comer(double cantidadGramos) { 	
    	this.peso += Math.abs(cantidadGramos); ;
    	this.estado = 1;
    }

    public void dormir() {
    	this.estado = 2;
    }
    
    public void despertar() {
    	this.estado = 3;
    }
    
    public void descansar() {
    	this.estado = 3;
    }
    
    public void jugar(int cantidadMinutos) {
    	cantidadMinutos = Math.abs(cantidadMinutos);
    	if(cantidadMinutos > 180) {
    		throw new IllegalArgumentException ("Valor demasiado grande");
    	}
    	this.estado = 4;    	
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

	public int getTipo() {
		return tipo;
	}

	public int getEstado() {
		return estado;
	}

	public double getPeso() {
		return peso;
	}

	public static int getContadorInstancias() {
		return contadorInstancias;
	}
	
	
    
    
}
