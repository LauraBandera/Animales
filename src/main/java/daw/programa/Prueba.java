package daw.programa;

import java.time.LocalDate;

import daw.Laura.Animal;
import daw.Laura.Persona;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación objetos clase Animal
		Animal a1 = new Animal();
		Animal a2 = new Animal(LocalDate.of(2020, 9, 12), "Tob", 3, 2, 20.5);
		
		//Creación objetos clase Persona
		Persona p1 = new Persona("Pepe", 47);
		Persona p2 = new Persona("Antonio", 25);
		
		//Imprimir por pantalla los objetos
		System.out.println(a1.toString());
		System.out.println(a2);
		
		//Impresión contador de instancias
		System.out.println("Contador de instancias: " + Animal.getContadorInstacias());
		
		//Clonamos a2 en a3
		Animal a3 = Animal.clonar(a2);
		
		//Impresión contador de instancias
		System.out.println("Contador de instancias: " + Animal.getContadorInstacias());
		
		//P1 despierta a todos los animales
		p1.llamar(a1);
		p1.llamar(a2);
		p1.llamar(a3);
		
		//P2 juega con a2 durante 120 min.
		p2.jugar(a2, 120);
		
		//P1 alimenta a a1 1000 gramos + impresión peso a1
		p1.alimentar(a1, 1000);
		System.out.println("Peso a1 = " + a1.getPeso());
		
		//P1 juega con a1 200 min + impresión peso a1
		p1.jugar(a1, 200);
		System.out.println("Peso a1 = " + a1.getPeso());
		
	}

}
