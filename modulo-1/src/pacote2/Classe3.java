package pacote2;

import pacote1.Classe1;

public class Classe3 {
    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        classe1.propriedadePublica = "Propriedade Pública";
        System.out.println(classe1.propriedadePublica);
    }
}
