public class ExemploOperadoresAritmeticos {

    public static void main(String[] args) {
        operacoesAritmeticas();
        System.out.println();
        operacoesDeAtribuicoes();
        System.out.println();
        operacoesIncrementoDecremento();
        System.out.println();
        operacoesRelacionais();
        System.out.println();
        operadoresLogicos();

    }

    public static void operacoesAritmeticas() {
        /*
         * Operadores aritméticos
         * Adição(+)
         * Subtração(-)
         * Multiplição(*)
         * Divisão(/)
         *
         * */

        int num1 = 10;
        int num2 = 20;

        int resultadoAdicao = num1 + num2;
        int resultadoSubtracao = num1 - num2;
        int resultadoMulticacao = num1 * num2;
        int resultadoDivisao = num2 / num1;

        System.out.println("Operações Aritméticas");
        System.out.println(num1 + " + " +  num2 + " = " + resultadoAdicao);
        System.out.println(num1 + " - " +  num2 + " = " + resultadoSubtracao);
        System.out.println(num1 + " * " +  num2 + " = " + resultadoMulticacao);
        System.out.println(num2 + " / " +  num1 + " = " + resultadoDivisao);
    }

    public static void operacoesDeAtribuicoes() {
        /*
        * Igual(=)
         * Mais igual(+=)
         * Menos igual(-=)
         * Multiplicado igual(*=)
         * Divisão igual(/=)
        * */

        int num1 = 0;
        int num2 = 10;
        int num3 = num1 + num2;
        System.out.println("Operações de Atribuição");
        System.out.println(num3);

        num3 += num3; //num3 = num3 = num3
        System.out.println(num3);

        num3 -= num3;
        System.out.println(num3);
    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("Operações de Incremento e Decremento");

        /*
        * Incremento(++)
        * Decremento(--)
        * */

        int num1 = 10;
        int num2 = 10;

        num1++; //num1 = num1 + 1;
        System.out.println(num1);
        num2--;
        System.out.println(num2);



    }

    public static void operacoesRelacionais() {
        System.out.println("Operações Relacionais");

        /*
        * Maior que(>)
        * Menor que(<)
        * Maior ou igual que(>=)
        * Menor ou igual que(<=)
        * Igual ao(==)
        * Diferent de(!=)
        *
        * */

        int num1 = 10;
        int num2 = 7;
        boolean eMaior = num1 > num2;
        boolean eMenor = num1 < num2;
        boolean eIgual = num1 == num2;
        boolean eDiferente = num1 != num2;
        boolean eMaiorOuIgual = num1 >= num2;
        boolean eMenorOuIgual = num1 <= num2;

        System.out.println(num1 + " é maior que " + num2 + " : " + eMaior);
        System.out.println(num1 + " é menor que " + num2 + " : " + eMenor);
        System.out.println(num1 + " é igual a " + num2 + " : " + eIgual);
        System.out.println(num1 + " é diferente de " + num2 + " : " + eDiferente);
        System.out.println(num1 + " é maior ou igual a que " + num2 + " : " + eMaiorOuIgual);
        System.out.println(num1 + " é menor ou igual a que " + num2 + " : " + eMenorOuIgual);
    }

    public static void operadoresLogicos() {
        System.out.println("Operadores Lógicos");

        /*
        * E - and(&&)
        * OU - or(||)
        * NÃO - not(!)
        * */

        int num1 = 6;

        boolean estaDentro = num1 >= 1 && num1 <= 5;
        boolean estaDentro1 = num1 >= 1 || num1 <= 12;

        System.out.println("AND: " + estaDentro);
        System.out.println("OR: " + estaDentro1);
        System.out.println("NOT: " + !estaDentro1);


    }

}
