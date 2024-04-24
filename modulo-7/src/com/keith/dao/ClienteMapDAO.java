package com.keith.dao;

import com.keith.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean register(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void delete(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);

        if(clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void update(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());

        if (clienteCadastrado != null) {
            clienteCadastrado.setName(cliente.getName());
            clienteCadastrado.setPhone(cliente.getPhone());
            clienteCadastrado.setNumber(cliente.getNumber());
            clienteCadastrado.setAddress(cliente.getAddress());
            clienteCadastrado.setCity(cliente.getCity());
            clienteCadastrado.setState(cliente.getState());
        }
    }

    @Override
    public Cliente check(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> searchAll() {
        return this.map.values();
    }
}
