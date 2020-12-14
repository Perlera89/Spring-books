package com.Rigoberto.Aplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Rigoberto.Aplication.Entidades.Libro3;

@Repository() 
public interface Libro3Repository extends CrudRepository<Libro3, Long> {

}
