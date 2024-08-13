package com.keith;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTests {

    @Test
    public void testeClasseCliente() {
        Cliente cliente = new Cliente();
        cliente.adicionarNome("Keith");

        Assert.assertEquals("Keith", cliente.getNome());
    }
}
