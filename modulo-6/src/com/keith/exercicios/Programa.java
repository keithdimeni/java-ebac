package com.keith.exercicios;

public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Maurício Dimeni");
        pessoa1.setDataDeNascimento("02/06/2001");
        pessoa1.setGenero("Masculino");
        pessoa1.setNacionalidade("Angolana");

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Gustavo Dimeni");
        pessoa2.setDataDeNascimento("15/03/1997");
        pessoa2.setGenero("Masculino");
        pessoa2.setNacionalidade("Angolana");

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setNome("Felicidade Dimeni");
        pessoa3.setDataDeNascimento("02/06/1998");
        pessoa3.setGenero("Feminino");
        pessoa3.setNacionalidade("Angolana");

//        System.out.println(pessoa1.getNome() + " - " + pessoa1.getGenero());
//        System.out.println(pessoa2.getNome() + " - " + pessoa2.getGenero());
//        System.out.println(pessoa3.getNome() + " - " + pessoa3.getGenero());
//        System.out.println();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Chevron");
        pessoaJuridica.add(pessoa1);
        pessoaJuridica.add(pessoa2);
        pessoaJuridica.add(pessoa3);

        pessoaJuridica.list().forEach(lista -> {
            System.out.println("Nome: " + lista.getNome() + "\nGênero: " + lista.getGenero() + "\nEmpresa - " + pessoaJuridica.getNome());
            System.out.println();
        });

    }
}
