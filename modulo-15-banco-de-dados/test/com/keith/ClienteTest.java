package com.keith;

import com.keith.dao.ClienteDAO;
import com.keith.dao.IClienteDAO;
import com.keith.domain.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception {
        clienteDAO = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setCodigo("11");
        cliente.setNome("Keith Dimeni");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(countCad == 1);

        Cliente clienteDB = clienteDAO.buscar("11");
        Assertions.assertNotNull(clienteDB);
        Assertions.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        Assertions.assertEquals(cliente.getNome(), clienteDB.getNome());

        Integer countDel = clienteDAO.excluir(clienteDB);
        Assertions.assertTrue(countDel == 1);
    }
}
