package icc.practica04;

/**
 *
 * @author Leonardo Gallo
 * @version 25/04/2019
 */
public class Dado {

    /** Atributos, variables, constantes u objetos */
    private int numCaras;
    private boolean balanceado;
    //agrega una variable referente al color del dado
    //agrega una variable referente al valor del último lanzamiento

    /**
     * Constructor para un dado convensional, de 6 caras
     *
     */
    public Dado() {
	numCaras = 6;
	balanceado = true;
	//inicializa el valor del color
	//inicializa valor del último lanzamiento
    }

    /**
     * Construye un dado como un poliedro con el número de caras señalado
     * y se selecciona el color de acuerdo a una tabla numérica.
     * @param numCaras
     * @param color
     */
    public Dado(int numCaras, int color) {
	//implementación EXTRA
    }

    /**
     * Construye un dado de 6 caras asignando una probabilidad de ocurrencia
     * a cada cara, dandonos así un dado NO balanceado.
     * @param numCaras
     * @param color
     */
    public Dado(int[] probabilidad) {
	/*
	  Implementación EXTRA:
      	  Debemos recordar que la suma de las probabilidades debe sumar 1,
	  de no ser el caso enviar un mensaje y devolver la construcción
	  de un dado de 6 caras convencional.
	 */
    }
    
    /**
     * COMÉNTAME...
     *
     */
    public void setNumCaras(int numCaras) {
	this.numCaras = numCaras;
    }

    /**
     * COMÉNTAME...
     *
     */
    public int getNumCaras() {
	return numCaras;
    }

    /**
     * COMÉNTAME...
     *
     */
    public boolean esBalanceado() {
	//aquí va tu implementación
	return false;
    }

    /**
     *
     *
     */
    public void setBalanceado(int[] probabilidad) {
	//implementación EXTRA
    }

    /**
     * COMÉNTAME...
     *
     */
    public int getColor() {
	//aquí va tu implementación
	return 0;
    }

    /**
     * COMÉNTAME...
     *
     */
    public void setColor() {
	//aquí va tu implementación
    }
    
    /**
     * COMÉNTAME...
     * @return 
     */
    public int lanzaDado() {
	//aquí va tu implementación
	/*
	  En caso de haber implementado un dado NO balanceado mandar llamar
	  aquí el método lanzaDadoTruqueado.
	 */
	return 0;
    }

    /**
     *
     *
     */
    private int lanzaDadoTruqueado() {
	/*
	  Implementación Extra
	  Sólo si se creó el constructor para un dado No balanceado
	*/
	return 0;	
    }
    
    /**
     * COMÉNTAME...
     *
     */
    public int[] lanzaNVeces(int lanzamientos) {
	//aquí va tu implementación
	return null;
    }

    /**
     * COMÉNTAME...
     *
     */
    public int getUltimoLanzamiento() {
	//aquí va tu implementación
	return 0;
    }

    /**
     * COMÉNTAME...
     *
     */
    public void muestraDado() {
	//aquí va tu implementación
    }

}
