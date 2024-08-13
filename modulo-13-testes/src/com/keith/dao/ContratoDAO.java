package com.keith.dao;

public class ContratoDAO implements IContratoDAO {

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Erro ao salvar, por favor verifique a configuracao de conexao do banco de dados");
        //return "Sucesso";
    }
}
