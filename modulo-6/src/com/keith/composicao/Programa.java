package com.keith.composicao;

public class Programa {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(87897897L);
        banco.setNome("Nu Bank Pagamentos");


        Poupanca contaPoupanca = new Poupanca();
        contaPoupanca.setBanco(banco);
        contaPoupanca.setSaldo(7676D);

        Corrente contaCorrente = new Corrente();
        contaCorrente.setBanco(banco);
        contaPoupanca.setSaldo(98786D);

    }
}
