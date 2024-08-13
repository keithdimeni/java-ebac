package com.keith;

import com.keith.dao.ContratoDAO;
import com.keith.dao.ContratoDAOMock;
import com.keith.dao.IContratoDAO;
import com.keith.service.ContratoService;
import com.keith.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDAO contratoDAO = new ContratoDAOMock();
        IContratoService contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvar() {

        IContratoDAO contratoDAO = new ContratoDAO();
        IContratoService contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }
}
