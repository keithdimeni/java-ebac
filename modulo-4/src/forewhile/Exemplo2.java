package forewhile;

public class Exemplo2 {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 100; contador++) {
//            System.out.println("Esta é a repetição nr: " + contador);
//            if (contador == 10 ) break;

            if (contador%5 != 0) {
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
