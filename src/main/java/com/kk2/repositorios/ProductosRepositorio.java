package com.kk2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kk2.data.Productos;

public interface ProductosRepositorio extends JpaRepository<Productos, Integer>{

	@Query("SELECT d FROM Productos d WHERE upper(d.nombre) LIKE concat('%',:nombre,'%')")
	List<Productos> findByNameLike(@Param("nombre")String nombre);

}
