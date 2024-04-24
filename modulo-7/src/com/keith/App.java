package com.keith;

import com.keith.dao.ClienteMapDAO;
import com.keith.dao.IClienteDAO;
import com.keith.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String option = JOptionPane.showInputDialog(null, "Digite 1 para CADASTRO, 2 para " +
                "CONSULTAR, 3 para EXCLUIR, 4 para ALTERAR e 5 para SAIR", "INICIO", JOptionPane.INFORMATION_MESSAGE);

        while(!isValidOption(option)) {
            if ("".equals(option)) {
                toExit();
            }
            option = JOptionPane.showInputDialog(null, "Opção inválida, digite 1 para CADASTRAR," +
                    " 2 para CONSULTAR, 3 para EXCLUIR, 4 para  ALTERAR e 5 para SAIR", "INICIO", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isValidOption(option)) {

            if (isToExit(option)) {
                toExit();
            } else if (isRegistered(option)) {
                String data = JOptionPane.showInputDialog(null, "Digite os dados do cliente " +
                        "separados por virgula,  conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                register(data);
            } else if (isCheck(option)) {
                String data = JOptionPane.showInputDialog(null, "Digite CPF do cliente:",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                check(data);
            } else if (isDelete(option)) {
                String data = JOptionPane.showInputDialog(null, "Digite CPF do cliente:",
                        "Excluir", JOptionPane.INFORMATION_MESSAGE);
                delete(data);
            } else {
                String data = JOptionPane.showInputDialog(null, "Digite os dados do cliente " +
                                "separados por virgula,  conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                update(data);
            }

            option = JOptionPane.showInputDialog(null, "Digite 1 para CADASTRO, 2 para CONSULTAR, " +
                            "3 para EXCLUIR, 4 para ALTERAR e 5 para SAIR",
                    "INICIO", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    /**
     *
     * @param option
     * @return
     */
    private static boolean isValidOption(String option){
        if ("1".equals(option) || "2".equals(option) || "3".equals(option)
                || "4".equals(option) || "5".equals(option)
        ) {
            return true;
        }
        return false;
    }
    private static boolean isRegistered(String option) {
        if ("1".equals(option)) {
            return true;
        }
        return false;
    }
    private static boolean isCheck(String option) {
        if ("2".equals(option)) {
            return true;
        }
        return false;
    }
    private static boolean isDelete(String option) {
        if ("3".equals(option)) {
            return true;
        }
        return false;
    }
    private static boolean isToExit(String option) {
        if ("5".equals(option)) {
            return true;
        }
        return false;
    }


    /**
     *
     * @param data
     */
    private static void register(String data) {
        String[] separateData = data.split(",");
        Cliente cliente = new Cliente(separateData[0],separateData[1],separateData[2],separateData[3],separateData[4],
                separateData[5],separateData[6]);
        Boolean isRegistered = iClienteDAO.register(cliente);
        if(isRegistered) {
            JOptionPane.showInputDialog(null, "Cliente cadastrado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInputDialog(null, "Cliente já se encontra cadastrado", "ERRO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void check(String data) {
        Cliente cliente = iClienteDAO.check(Long.parseLong(data));
        if (cliente != null) {
            JOptionPane.showInputDialog(null, "Cliente encontrado com sucesso: " + cliente, "Consulta",  JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInputDialog(null, "Cliente não encontrado: ", "Consulta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void delete(String data) {
        iClienteDAO.delete(Long.parseLong(data));
        JOptionPane.showInputDialog(null, "Cliente excluido com sucesso: ", "Excluir", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void update (String data) {
        String[] separateData = data.split(",");
        Cliente cliente = new Cliente(separateData[0],separateData[1],separateData[2],separateData[3],separateData[4],separateData[5],separateData[6]);
        iClienteDAO.update(cliente);
    }

    public static void  toExit() {
        String registeredClients = "";
        for (Cliente cliente : iClienteDAO.searchAll()) {
            registeredClients += cliente.toString() + "\n";
        }
        JOptionPane.showInputDialog(null, "Clientes Cadastrados: " + registeredClients,  "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }


}
