package icc.centroIyC;

import java.util.Random;

/**
 * Clase que nos permite crear poblaciones bajo el contexto de Un Mundo Feliz
 * @author Leonardo Gallo
 */
public class Poblacion {
    
    private Humano[] poblacion;

    /**
     * Contructo por omisión
     *
     */
    public Poblacion(){
    }

    /**
     * Método que crea una población de Humanos, con al menos uno de cada casta.
     * @param n Tamaño de la población (longitud del arreglo de Humanos).
     * @return Un arreglo de objetos de tipo Humano.
     * @throws ExcepcionPoblacion 
     */
    public Humano[] construye(int n) throws ExcepcionPoblacion {
        return poblacion;
    }
    
    /**
     * Método que imprime en pantalla si un individuo pertenece a la misma casta,
     * a una inferior o a una superior respecto a cada individuo de la población.
     * Se realizará la comparación con cada uno de los habitantes.
     * @param individuo Humano que va a ser comparado.
     * @param habitantes Arreglo de Humanos. 
     */        
    public void compara(Humano individuo, Humano[] habitantes) {    
        for (int j = 0; j < habitantes.length; j++) {
            if (individuo.compareTo(habitantes[j]) == 0) {
                System.out.println("Los individuos pertenecen a la misma casta.");
            }
            if (individuo.compareTo(habitantes[j]) == 1) {
                System.out.println("El individuo pertenece a una casta superior.");
            }
            if (individuo.compareTo(habitantes[j]) == -1) {
                System.out.println("El individuo pertenece a una casta inferior.");
            }    
        }    
    }
}    
