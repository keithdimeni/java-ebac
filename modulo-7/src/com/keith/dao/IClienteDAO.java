package com.keith.dao;

import com.keith.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean register(Cliente cliente);
    public void delete(Long cpf);
    public void update(Cliente cliente);
    public Cliente check(Long cpf);
    public Collection<Cliente> searchAll();

}
