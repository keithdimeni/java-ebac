public class Exemplo {


    /**
     * Boxing (autoboxing) é a conversão do tipo primitivo para a sua correspondente Wrapper
     * Unboxing: é a conversão de um wrapper para sua correspondente primitivo
     * @param args
     */
    public static void main(String[] args) {

        /*
        * Boxing(Autoboxing)
        * */
        Boolean status = true; // Com boxing
        Boolean status2 = Boolean.TRUE; //Sem o boxing
        Character c = 'A'; //Boxing
        Integer idade = 10; //Boxing

        /*
        * Unboxing
        * */
        boolean a = Boolean.TRUE; //Unboxing
        byte b = Byte.valueOf("asd"); //Unboxing
        char charr = Character.valueOf('a'); //Unboxing
        int idadeee = Integer.valueOf(23); //Unboxing


    }
}
