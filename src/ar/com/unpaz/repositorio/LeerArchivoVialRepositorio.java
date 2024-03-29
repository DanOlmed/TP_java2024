package ar.com.unpaz.repositorio;
import java.io.*;

import java.util.*;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Rutas;

public class LeerArchivoVialRepositorio implements Funcionalidades{

	@Override
	public List<Rutas> getListRutas() {
		//Reemplazar en el nombre del archivo 
		File sFile = new File ("Aqui va la ruta donde usted tenga alojado el archivo Vial.csv");
		List <Rutas> sListRutas = new ArrayList<Rutas>();
		FileReader sFileReader;
		
		try {
			sFileReader = new FileReader (sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Rutas sRutas = new Rutas();
				sRutas.setCodigo(data[0]); 
				sRutas.setCalle(data[1]);
				sRutas.setAltura(data[2]);
				sRutas.setRuta(data[3]);
				sRutas.setNumero(data[4]);
				sListRutas.add(sRutas);
				
			}
			if (sBufferReader != null) {
				   try {
					   sBufferReader.close();
					   } 
					   catch (IOException e) {
					    e.printStackTrace();
					   }
					  }
		
					 
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sListRutas;
	}
	

}
