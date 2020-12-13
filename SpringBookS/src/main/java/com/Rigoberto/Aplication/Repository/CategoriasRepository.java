package com.Rigoberto.Aplication.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Rigoberto.Aplication.Entidades.Categorias;
//Inidicamos que es un repositorio.
@Repository("categoriasrepository")
public interface CategoriasRepository extends CrudRepository<Categorias, Long>{
}
