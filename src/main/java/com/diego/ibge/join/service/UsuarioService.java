package com.diego.ibge.join.service;

import com.diego.ibge.join.client.Join;
import com.diego.ibge.join.model.Usuario;
import com.diego.ibge.join.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matto on 15/06/2017.
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) {
        Usuario usuario = usuarioRepository.findOne(id);

        return usuario;
    }


    public List<Join> findJoin() {
        List<Object[]> result = usuarioRepository.findJoin();
        List<Join> joinList = new ArrayList<>();

        for (Object[] o: result) {
            Join join = new Join();
            join.setIdUsuario(Long.parseLong(String.valueOf(o[0])));
            join.setNome(String.valueOf(o[1]));
            join.setEndereco(String.valueOf(o[2]));

            joinList.add(join);
        }

        return joinList;
    }

}
