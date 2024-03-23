package ifelse;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int resultado = s.nextInt();

        if (resultado > 1 && resultado < 5) {
            System.out.println("Resultado está entre 1 e 5");
        } else if (resultado >= 5 && resultado < 8) {
            System.out.println("Resultado está entre 5 e 8");
        } else {
            System.out.println("Resultado diferente dos anteriores");
        }
    }

}
