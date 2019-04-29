package icc.practica06;

/**
 * Clase que simula el manejo de una base de datos no persistente.
 *
 * @author Leonardo Gallo
 * @version 29/04/2019
 */
public class ManejadorBaseDeDatos {

    /** Representa una tabla en la base de datos */
    private String[][] bdd;
    /** Identificador de cada columna de la tabla */
    private final String[] ID_COLUMNA;
    /** Resultado de la última búsqueda */
    private String ultimaBusqueda;

    /**
     * COMÉNTAME...
     *
     * @param idColumna
     * @param numRenglones
     */
    public ManejadorBaseDeDatos(String[] idColumna, int numRenglones) {
	//aquí va tu implementación...
    }

    /**
     * COMÉNTAME...
     *
     * @param dato
     * @param quienRegistro
     */
    public void agrega(String[] dato, String quienRegistro) {
	//aquí va tu implementación...
    }

    /**
     * COMÉNTAME...
     *
     * @param elemento
     * @param columna
     * @return
     */
    public String buscaXColumna(String elemento, String columna) {
	//aquí va tu implementación...
	return "";
    }

    /**
     * COMÉNTAME...
     *
     * @param elemento
     * @param columna
     */
    public void eliminaXColumna(String elemento, String columna) {
	//aquí va tu implementación...
    }

    /**
     * COMÉNTAME...
     *
     */
    public void muestraBDD() {
	//aquí va tu implementación...
    }

    /**
     * COMÉNTAME...
     *
     * @param renglon
     * @return 
     */
    public String[] getElemento(int renglon) {
	//aquí va tu implementación...
	return null;
    }

    /**
     * COMÉNTAME...
     *
     * @return 
     */
    public String getUltimaBusqueda() {
	//aquí va tu implementación...
	return "";
    }
}
