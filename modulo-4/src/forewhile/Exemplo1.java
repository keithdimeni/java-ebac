package forewhile;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Linha - " + i);
//        }

        /*
        * O primeiro FOR é usado quando se conhece
        * a quantidade de resgitro
        * */
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Linha - " + i);
            valores.add(i);
        }

        /*
         * O segundo FOR é usado quando não se conhece
         * a quantidade de registro
         * */
        System.out.println("=============");
        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }

        /*
         * O mesmo que o segundo FOR só que usando Streams
         * */
        System.out.println("==================");
        valores.forEach(i -> System.out.println("Linha " + i));
    }
}
