package ar.com.unpaz.principal;


import ar.com.unpaz.model.*;
import java.util.*;
import ar.com.unpaz.servicio.*;
public class Inicio {
	
	
	public static void main(String[] args) {
		
		LeerArchivoVialServicio servicio = new LeerArchivoVialServicio ();
		
		System.out.println("----------------");
		System.out.println("Rutas nacionales");
		System.out.println("----------------");
		
		List<Rutas> listaInicio = new ArrayList<Rutas>();
		listaInicio = servicio.getListRutas();
		
		for(Rutas rutas : listaInicio) {
			System.out.println("Codigo: "+rutas.getCodigo() +" Calle:  "+rutas.getCalle()+" Altura: "+rutas.getAltura() + " Ruta: "+rutas.getRuta()+ " Numero: "+rutas.getNumero());
		}

			
		
		
		
			

	}
}
