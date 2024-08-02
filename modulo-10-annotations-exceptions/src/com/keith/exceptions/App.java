package com.keith.exceptions;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o codigo do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente("123");
        } catch(ClienteNaoEncontrado2Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
