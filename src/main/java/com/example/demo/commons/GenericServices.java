package com.example.demo.commons;

import java.io.Serializable;
import java.util.List;

//Clase para servicios genericos del CRUD
public interface GenericServices <T, ID extends Serializable>  {
	
	//Guardar o editar Entidad
	T save(T entity);
	
	//eliminar entidad
	void delete(ID id);
	
	//Listar una entidad por id
	T get (ID id);
	
	//generar lista de entidades
	List<T> getAll();
	

}
