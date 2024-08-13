package com.keith;

import com.keith.dao.ClienteDAO;
import com.keith.dao.ClienteDAOMock;
import com.keith.dao.IClienteDAO;
import com.keith.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDAO mockDAO = new ClienteDAOMock();

        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);

    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErrorNoSalvarTest() {
        IClienteDAO clienteDAO = new ClienteDAO();

        ClienteService clienteService = new ClienteService(clienteDAO);
        String retorno = clienteService.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

}
