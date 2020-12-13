package com.Rigoberto.Aplication.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Rigoberto.Aplication.Entidades.Libros;
//Inidicamos que es un repositorio.
@Repository("librosrepository")
public interface LibrosRepository extends CrudRepository<Libros, Long> {
	

}
