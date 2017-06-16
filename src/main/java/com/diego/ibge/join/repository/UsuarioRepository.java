package com.diego.ibge.join.repository;

import com.diego.ibge.join.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by matto on 15/06/2017.
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {



    @Query(value = "select " +
            "u.id, " +
            "u.nome, " +
            "e.endereco " +
            "from usuario u " +
            "left join endereco e on u.id = e.idUsuario ",
            nativeQuery = true)
    List<Object[]> findJoin();


    //Join findJoin(Long id);

}
