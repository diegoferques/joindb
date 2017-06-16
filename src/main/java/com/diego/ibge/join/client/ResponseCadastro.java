package com.diego.ibge.join.client;

/**
 * Created by matto on 15/06/2017.
 */
public class ResponseCadastro {
    private String mensagem;
    private Boolean sucesso;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }
}
