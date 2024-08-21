package com.keith.dao;

import com.keith.dao.generic.jdbc.ConnectionFactory;
import com.keith.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = insert();
            statement = connection.prepareStatement(sql);
            adicionarParametrosInsert(statement, cliente);

            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = update();
            statement  = connection.prepareStatement(sql);
            adicionarParametrosUpdate(statement, cliente);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Cliente buscar(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = select();
            statement = connection.prepareStatement(sql);
            adicionarParametrosSelect(statement, codigo);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                cliente = new Cliente();
                Long id = resultSet.getLong("ID");
                String nome = resultSet.getString("NOME");
                String codigo2 =  resultSet.getString("CODIGO");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCodigo(codigo2);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return cliente;
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Cliente> listaCliente = new ArrayList<>();
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = selectAll();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                cliente = new Cliente();
                Long id = resultSet.getLong("ID");
                String nome = resultSet.getString("NOME");
                String codigo2 =  resultSet.getString("CODIGO");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCodigo(codigo2);
                listaCliente.add(cliente);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return listaCliente;
    }

    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = delete();
            statement  = connection.prepareStatement(sql);
            adicionarParametrosDelete(statement, cliente);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }



    private String insert() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO CLIENTE (ID, CODIGO, NOME) ");
        stringBuilder.append("VALUES (nextval('SQ_CLIENTE'),?,?)");
        return stringBuilder.toString();
    }

    private void adicionarParametrosInsert(PreparedStatement statement, Cliente cliente) throws SQLException {
        statement.setString(1, cliente.getCodigo());
        statement.setString(2, cliente.getNome());
    }


    private void adicionarParametrosUpdate(PreparedStatement statement, Cliente cliente) throws SQLException {
        statement.setString(1, cliente.getCodigo());
        statement.setString(2, cliente.getNome());
        statement.setLong(3, cliente.getId());
    }

    private void adicionarParametrosSelect(PreparedStatement statement, String codigo) throws SQLException {
        statement.setString(1, codigo);
    }

    private String select() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM CLIENTE ");
        stringBuilder.append("WHERE CODIGO = ?");
        return stringBuilder.toString();
    }

    private void adicionarParametrosDelete(PreparedStatement statement, Cliente cliente) throws SQLException {
        statement.setString(1, cliente.getCodigo());
    }
    private String delete() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM CLIENTE ");
        stringBuilder.append("WHERE CODIGO = ?");
        return stringBuilder.toString();
    }


    private String update() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE CLIENTE");
        stringBuilder.append("SET NOME = ?, CODIGO = ?");
        stringBuilder.append("WHERE ID = ?");
        return stringBuilder.toString();
    }



    /**
     *
     * @return
     */
    private String selectAll() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM CLIENTE");
            return stringBuilder.toString();
    }


    private void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
