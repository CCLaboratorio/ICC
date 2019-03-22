package icc.utilidades;

/**
 *
 * Clase que modela funciones matemáticas
 * @author Leonardo Gallo
 * @version 14/03/2019
 */
public class Funcion {

    /**
     *
     *
     *
     */
    public static int calculaFactorialIterativo(int n) {
	if(n < 0){
	    System.out.println("EL factorial está definido solo para positivos");
	    return -1;
	}
	//aquí va tu implementación
	return 0;
    }

    /**
     *
     *
     * @return regresa el fatorial de un número positivo o cero, -1 en casos negativos
     */
    public static int calculaFactorialRecursivo(int n) {
	if(n < 0){
	    System.out.println("EL factorial está definido "
			       + "solo para positivos");
	    return -1;
	}
	return ((n == 0) ? 1 : n*calculaFactorialRecursivo(n-1));
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     * Si se ingresa un valor negativo regresamos 0.
     * @param numero valor de fibonacci a calcular
     */
    public static int calculaFibonacciRecursivo(int numero) {
	//aquí va tu implementación
	return 0;
    }

    /**
     * COMÉNTAME
     * @param numero
     */
    public static boolean esPar(int numero) {
	//aquí va tu implementación
	return false;
    }
    
    /**
     * COMÉNTAME
     * @param numero
     */
    public static boolean esImpar(int numero) {
	//aquí va tu implementación
	return false;
    }

    /**
     * COMÉNTAME
     * @param numero
     */
    public static boolean esPrimo(int numero) {
	return true;
    }

    /**
     * Recibe dos parámetros y verifica si el segundo es divisor
     * del primero
     * @param numero número a dividir
     * @param divisor número a verificar si es divisor de numero
     */
    public static boolean esDivisor(int numero, int divisor) {
	return false;
    }
    /**
     * COMÉNTAME
     * @param numero
     */
    public static String calculaDivisores(int numero) {
	//aquí va tu implementación
	return "";
    }

    /**
     * COMÉNTAME
     * @param cadena
     * @param c
     */
    public static int buscaCoincidencias(String cadena, char c) {
	//aquí va tu implementación
	return 0;
    }

    /**
     * Nos dice el número de veces que aparece una palabra en una oración
     * @param oracion
     * @param palabra
     */
    public static int buscaPalabras(String oracion, String palabra) {
	//aquí va tu implementación
	return 0;
    }
    
    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
	//Decllaración de variables
	Scanner sc = new Scanner(System.in);
	int numero;
	
	System.out.println("¿Qué número de Fibonacci quieres?");
	numero = sc.nextInt();
	System.out.println("El resultado es: " + calculaFibonacciRecursivo(numero));

	System.out.println(calculaFibonacciRecursivo(numero));
	System.out.println("lista de números de Fibonacci hasta " + numero);
	for (int i = 0; i <= numero; i++) {
	    System.out.println(calculaFibonacci(i));
	}

	System.out.println("Verificación de primos en un rango de 1 a 20");

	for (int i = 1; i <= 20; i++) {
	    System.out.println("¿" + i + " es un número primo?" + esPrimo(i));
	}
    }

}
