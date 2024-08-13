package com.keith.service;

import com.keith.dao.ContratoDAO;
import com.keith.dao.IContratoDAO;

public class ContratoService implements IContratoService {

    private IContratoDAO contratoDAO;
    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Sucesso";
    }
}
