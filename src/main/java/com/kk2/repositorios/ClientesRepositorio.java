package com.kk2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kk2.data.Clientes;

public interface ClientesRepositorio extends JpaRepository<Clientes, Integer>{

	@Query("SELECT d FROM Clientes d WHERE upper(d.nombre) LIKE concat('%',:nombre,'%')")
	List<Clientes> findByNameLike(@Param("nombre")String nombre);

}
