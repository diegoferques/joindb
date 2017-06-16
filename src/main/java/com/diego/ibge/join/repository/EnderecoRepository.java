package com.diego.ibge.join.repository;

import com.diego.ibge.join.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by matto on 15/06/2017.
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

}
