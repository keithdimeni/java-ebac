package switchcase;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome de um animal: ");
        String nomeAnimal = s.next();
        System.out.println(exemploDeSwitch(nomeAnimal));
    }

    public static String exemploDeSwitch (String nomeAnimal) {
        String resultado;
        switch(nomeAnimal) {
            case "Cão":
            case "Gato":
                resultado = "Animail doméstico";
                break;
            case "Tigre":
                resultado = "Animal selvagem";
                break;
            default:
                resultado = "Desconhecido";
                break;
        }
        return resultado;
    }
}
