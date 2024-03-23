package ifelse;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int resultado = s.nextInt();
        if (resultado > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }

    }
}
