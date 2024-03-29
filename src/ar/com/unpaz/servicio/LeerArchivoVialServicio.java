package ar.com.unpaz.servicio;
import java.util.*;


import ar.com.unpaz.crud.Funcionalidades;

import ar.com.unpaz.model.Rutas;
import ar.com.unpaz.repositorio.LeerArchivoVialRepositorio;

public class LeerArchivoVialServicio implements Funcionalidades{

	@Override
	public List<Rutas> getListRutas() {
		LeerArchivoVialRepositorio repo = new LeerArchivoVialRepositorio();
		List<Rutas> sList = new ArrayList<Rutas>();
		sList = repo.getListRutas();
		return sList;
		
	}
	
	

}
