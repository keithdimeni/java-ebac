package br.com.keith.behavioral.templateMethod;

public abstract class Trabalhador {

    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    private void iniciarRotina(){
        System.out.println("Iniciando a rotina");
    }

    private void levantar() {
        System.out.println("Levantando da cama");
    }

    private void irAoTrabalho() {
        System.out.println("Ir ao trabalho");
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltar para casa!");
    }

}
