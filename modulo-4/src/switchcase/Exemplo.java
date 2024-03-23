package switchcase;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = s.nextInt();
        System.out.println(pegarIdade(idade));
    }

    public static String pegarIdade(int idade) {
        String resultado;
        switch(idade) {
            case 0:
            case 5:
                resultado = "Você é um bebê";
                break;
            case 11:
            case 17:
                resultado = "Você é um adolescente";
                break;
            default:
                resultado = "Você é um adulto";
                break;
        }

        return resultado;
    }
}
