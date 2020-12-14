package com.Rigoberto.Aplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Rigoberto.Aplication.Entidades.Libro1;
@Repository("libro1repository")//Nombre del Repositorio.
public interface Libro1Repository extends CrudRepository<Libro1, Long> {

}
