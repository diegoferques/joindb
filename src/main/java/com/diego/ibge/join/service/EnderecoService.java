package com.diego.ibge.join.service;

import com.diego.ibge.join.model.Endereco;
import com.diego.ibge.join.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by matto on 15/06/2017.
 */
@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco findById(Long id) {
        Endereco endereco = enderecoRepository.findOne(id);

        return endereco;
    }
}
