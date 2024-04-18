package com.keith.abstratas;

public class Programa {
    public static void main(String[] args) {

        /**
         * Assalariado
         * */
        Assalariado assalariado = new Assalariado();
        assalariado.setNome("Maurício");
        assalariado.setSobrenome("Dimeni");
        assalariado.setCpf("12");
        assalariado.setSalario(200d);
        imprimir(assalariado);
        System.out.println();

        /**
         * Comissionado
         */
        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Keith");
        comissionado.setTotalVenda(5000d);
        comissionado.setTotalCommisao(0.15);
        imprimir(comissionado);
        System.out.println();

        /**
         * Horista
         */
        Horista horista = new Horista();
        horista.setNome("Dimeni");
        horista.setPrecoHora(70d);
        horista.setTotalHoraTrabalhada(40d);
        imprimir(horista);
        System.out.println();

    }

    public static void imprimir(Empregado empregado){
        //Fazer casting de classe Empregado para Horista
//        if(empregado instanceof Horista){
//            Horista horista = (Horista) empregado;
//            System.out.println("Horista: " + horista.getTotalHoraTrabalhada() + "h");
//            System.out.println();
//        }

        System.out.println(empregado.getNome() + "\nSalário: " + empregado.vencimento());
    }
}
