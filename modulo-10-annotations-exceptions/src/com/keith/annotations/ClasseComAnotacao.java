package com.keith.annotations;

@PrimeiraAnotacao(value="Keith", bairros={"Bairro1", "Bairro3"}, numeroCasa = 133)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Dimeni", bairros = "sequele", numeroCasa = 15)
    private String nome;
}
