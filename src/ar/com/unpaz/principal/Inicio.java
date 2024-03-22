package ar.com.unpaz.principal;
import java.io.*;
import java.util.Arrays;

public class Inicio {
	
	public static final String SEPARADOR = "_";
	public static void main(String[] args) {
		BufferedReader bufferLectura = null;
		 try {
		  // Abrir el .csv en buffer de lectura
		  bufferLectura = new BufferedReader(new FileReader("C:\\Users\\giser\\OneDrive\\Escritorio\\2do año-1er cuatrimestre\\Programacion concurrente y paralela\\vial.csv"));
		  
		  // Leer una linea del archivo
		  String linea = bufferLectura.readLine();
		  
		  while (linea != null) {
		   // Separar la linea leída con el separador definido previamente
		   String[] campos = linea.split(SEPARADOR); 
		   
		   System.out.println(Arrays.toString(campos));
		   
		   // Volver a leer otra línea del fichero
		   linea = bufferLectura.readLine();
		  }
		 } 
		 catch (IOException e) {
		  e.printStackTrace();
		 }
		 finally {
		  // Cierro el buffer de lectura
		  if (bufferLectura != null) {
		   try {
		    bufferLectura.close();
		   } 
		   catch (IOException e) {
		    e.printStackTrace();
		   }
		  }
		 }
			

	}
}
