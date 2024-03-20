public class ExemploVariaveisDeClasseEMetodos {
    private int numero; // Isso é uma varíavel de classe
    private String texto;

    /**
     * Construtor, pode se ter mais de um contrutor
     */
    public ExemploVariaveisDeClasseEMetodos() {
        this.numero = 0;
        this.texto = "";
    }

    public ExemploVariaveisDeClasseEMetodos(int numero) {
        this.numero = numero;
        this.texto = "";
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTexto(String texto) {
        this.texto = "Umjhuhndjk";
    }

    public void variavelDeMetodo() {
        int numero = 10; // só o metod tem acesso
    }

}
