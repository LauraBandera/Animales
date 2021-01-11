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
    
    private LocalDate nacimiento;
    private String nombre;
    private int tipo, //1 = Gato, 2 = Perro, 3 = Lagarto, 4 = Cobaya, 5 = Periquito
            estado; //1 = Comiendo, 2 = Durmiendo, 3 = Despierto/reposo, 4 = Jugando
    private double peso;
    private int numAnimales = 0;

    public Animal() {
        this.tipo = 1;
        this.nombre = "Turrón";
        this.peso = 2200;
        this.estado = 2;
        this.nacimiento = LocalDate.now();
        numAnimales++;  
    }

    public Animal(LocalDate nacimiento, String nombre, int tipo, int estado, double peso) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.peso = peso;
        numAnimales++;
    }
    
    public void comer(double cantidadGramos) { 	
    	this.peso += Math.abs(cantidadGramos); ;
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
    	}else if(cantidadMinutos > 30) {
    		this.peso -= (cantidadMinutos/30)*20;
    	}else {
    		this.peso -= 10;
    	}
    }
    
    
    
}
