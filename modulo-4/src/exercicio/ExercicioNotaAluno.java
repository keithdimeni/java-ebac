package exercicio;

import java.util.Scanner;

public class ExercicioNotaAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = s.next();
        System.out.println("Digite a primeira nota: ");
        Integer nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        Integer nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        Integer nota3 = s.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if (media < 5) {
            System.out.println("Nome: " + nomeAluno + " - REPROVADO");
        } else if (media < 7) {
            System.out.println("Nome: " + nomeAluno + " - RECURSO");
        } else {
            System.out.println("Nome: " + nomeAluno + " - APROVADO");
        }

    }
}
