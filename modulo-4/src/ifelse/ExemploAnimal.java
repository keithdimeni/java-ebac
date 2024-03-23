package ifelse;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = examploDeIf(texto);
        System.out.println(animal);

    }

    public static String examploDeIf(String animal) {
        String resultado;
        if (animal.equals("CÃO") || animal.equals("GATO")) {
            resultado = "Animal doméstico";
        } else if (animal.equals("TIGRE")) {
            resultado = "Animal selvagem";
        } else {
            resultado = "Desconhecido";
        }
        return resultado;
    }
}
