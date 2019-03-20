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
	    System.out.println("EL factorial está definido "
			       + "solo para positivos");
	    return -1;
	}
	
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
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("EL factorial de 4 es "
			   + calculaFactorialRecursivo(4));
    }
}
