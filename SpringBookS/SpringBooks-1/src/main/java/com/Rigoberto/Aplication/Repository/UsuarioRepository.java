package com.Rigoberto.Aplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Rigoberto.Aplication.Entidades.Usuario;
//Inidicamos que es un repositorio.
@Repository("usuariorepository")
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
}
