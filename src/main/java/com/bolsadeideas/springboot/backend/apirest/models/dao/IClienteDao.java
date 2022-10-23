package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	//Mostrar en el formulario una lista de regiones, mapear a una consulta Jpa
	//Region, nombre de la clase entity
	@Query("from Region")
	public List<Region> findAllRegiones();
}
