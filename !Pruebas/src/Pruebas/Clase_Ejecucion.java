/*******************************************************
	Programa de Ejecuci�n de pruebas basicas
	para el estudio del lenguaje de programaci�n JAVA
********************************************************/
package Pruebas;

import java.util.Scanner;

public class Clase_Ejecucion {
	public static void main(String[] args){
		//Clase Ejecutora
		prueba3();
	}

	public static void prueba1() {
		int o;
		
		Scanner tecla = new Scanner(System.in);
		System.out.print("presione un numero del 0 al 4 \n");
		o = tecla.nextInt();
		
		if(o == 1){
			System.out.print("Hola");
		}
		
		else {
			System.out.print("Error, Vuleva a Intentarlo");
		}
	}
	
	public static void prueba2() {
		int a, b, Resultado;
		String nombre;
		
		a = 25; b = 5;
		Resultado = a + b;
		System.out.print("Resultado: " + Resultado);
	}
	
	public static void prueba3() {
		String nombre;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu Edad: ");
		edad = sc.nextInt();
		
		System.out.print("Introduce tu Nombre: ");
		nombre = sc.next();
		
		System.out.println("\nHola soy " + nombre + " y tengo " + edad + " a�os de edad");
	}

}
