package icc.lectura;

import java.io.*;
    
/**
 *
 * Lectura de teclado y archivos usando BufferReader
 *
 * @author Leonardo Gallo
 * @version 1
 */
public class Main {

    /**
     *
     *
     */
    public static void main(String[] args) throws IOException {
	//Para leer de teclado
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//Para leer de un archivo
	//en lugar de args[0] coloca el nombre del archivo en formato de cadena
	//BufferedReader flujo = new BufferedReader(new FileReader(args[0]));
	BufferedReader flujo = new BufferedReader(new FileReader("src/icc/lectura/solicitud.txt"));
	//Para escribir en un archivo
	BufferedWriter escritura;

	String peticion;
	String nombre;

	System.out.println("¿Cuál es tu nombre?");
	nombre = in.readLine();
	System.out.println("¡Bien hecho, " + nombre + "! Has usado un buffer para leer en teclado");

	//leyendo archivo
	System.out.println("\nLeyendo la solicitud:");
	peticion = flujo.readLine();
	while (!peticion.equals("*")) {
	    System.out.println(peticion);
	    peticion = flujo.readLine();
	}

	flujo.close();
	
	//Ahora escribimos en un archivo
	System.out.println("\nEscribimos en el archivo resultados.txt");
	escritura = new BufferedWriter(new FileWriter("src/icc/lectura/resultados.txt"));
	for (int i = 0; i < 10; i++) {
	    escritura.write("Valor " + i*i + "\n"); //Cambia la cadena para escribir otra cosa en el archivo
	}
	escritura.write("*");
	escritura.close();

	flujo = new BufferedReader(new FileReader("src/icc/lectura/resultados.txt"));
	//leyendo archivo de resultados
	System.out.println("\nLeemos lo que se escribió en el archivo");
	peticion = flujo.readLine();
	while (!peticion.equals("*")) {
	    System.out.println(peticion);
	    peticion = flujo.readLine();
	}
	System.out.println("Corroboralo revisando el archivo, intenta jugar con lo que escribe el buffer...");
	flujo.close();
    }
}
