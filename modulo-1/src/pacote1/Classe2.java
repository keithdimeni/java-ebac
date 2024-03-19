package pacote1;

public class Classe2 {
    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        classe1.propriedadePublica = "Propriedade Pública";
        classe1.propriedadeDefault = "Propriedade Default(Padrão)";
        classe1.propriedadeProtegida = "Propriedade Protegida";


        System.out.println(classe1.propriedadePublica);
        System.out.println(classe1.propriedadeDefault);
        System.out.println(classe1.propriedadeProtegida);
    }
}
