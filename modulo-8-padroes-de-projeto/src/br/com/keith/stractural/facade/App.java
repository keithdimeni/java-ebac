package br.com.keith.stractural.facade;

/**
 * @autor mauricio.dimeni
 *
 * Facade: oferece uma interface unificada para ium conjunto
 * de objetos que constituem um subsistema, definindo uma
 * interface de alto nivel que facilita no uso
 */
public class App {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();

        service.cadastrarApartamento(new Apartamento(1L, "Rua da Palmeiras"));
    }
}
