package com.Rigoberto.Aplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Rigoberto.Aplication.Entidades.Libro2;

@Repository
public interface Libro2Repository extends CrudRepository<Libro2, Long> {
	

}
