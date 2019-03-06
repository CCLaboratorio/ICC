package icc.stdio;

import java.util.Scanner;

/**
 * Ejercicio 1:
 * Clase para ejemplificar el uso de entrada y salida estándar, para
 * poner en práctica la implementación de una solución a un problema
 * a partir de un diagrama de flujo.
 * @autho Leonardo Gallo
 * @version 05/03/2019
 *
 */
public class Main {
    /* Inicialización de variables y objetos de clase */
   
    /**
     *
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
	//Declaración de variables al inicio del método
	Scanner sc = new Scanner(System.in);
	String nombre;
	int edad, a;
	double x, y;
	
	/*
	  1. Programa que saluda, pregunta el nombre al usuario y 
	  dirigiéndose al usuario por su nombre dice algo referente.
	 */
	System.out.println("¡Bienvenido! ¿Cuál es tu nombre?");
	nombre = sc.nextLine();
	System.out.println("Hola " + nombre + "¿Cuántos años tienes?");
	edad = sc.nextInt();

	//estructura de un condicional
	if (edad >= 18) {
	    System.out.println("¡Bienvenido al mundo de los adultos!");
	} else {
	    System.out.println("Estás chavo XD :V");
	}

	/*
	  2. Solicitamos dos valores numéricos y devuelva un mensaje diciendo
	  cuál es el mayor de ellos.

	 */
	System.out.println("Bienvenido, ingresa dos valores numéricos:");
	x = sc.nextDouble();
	y = sc.nextDouble();

	if (x > y) {
	    System.out.println(x + " es el número mayor ");
	} else {
	    if (x==y)
		System.out.println("Los números son iguales");
	    else
		System.out.println(y + "es el número mayor");
	}

	/*
	  3. Solicita un entero 'n'  y si es par calcule la potencia 
	  n^n y si es impar la raiz cuadrada de n, imprimimos resultados
	  en pantalla.
	 */

	System.out.println("Ingresa un número");
	a = sc.nextInt();
	if (a%2 == 0 )
	    System.out.println("El número es par, obtenemos potencia " + Math.pow(a, a));
	else
	    System.out.println("El número es impar, obtenemos raíz, " + Math.sqrt(a));
	
	//Cerramos el servicio
	sc.close();	
    }
    
}
