package com.diego.ibge.join.service;

import com.diego.ibge.join.client.Join;
import com.diego.ibge.join.model.Endereco;
import com.diego.ibge.join.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by matto on 15/06/2017.
 */
@Service
public class JoinService {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EnderecoService enderecoService;

    public void iniciar() {
        System.out.println("##################");
        System.out.println("Funcionou!");
        System.out.println("---------");

        System.out.println(this.findUsuario(2L));

        System.out.println("---------");

        System.out.println(this.findEndereco(2L));

        System.out.println("---------");

        for (Join join: findJoin()) {
            System.out.println(join.getIdUsuario() + " - " + join.getNome() + " - " + join.getEndereco());
        }

        System.out.println("---------");
        System.out.println("##################");
    }

    public String findUsuario(Long id) {

        Usuario usuario = usuarioService.findById(id);

        return usuario.getId() + " - " + usuario.getNome();
    }

    public String findEndereco(Long id) {

        Endereco endereco = enderecoService.findById(id);

        return endereco.getId() + " - " + endereco.getEndereco();
    }

    public List<Join> findJoin() {
        List<Join> joinList = usuarioService.findJoin();

        return joinList;
    }

}
