package br.com.keith.stractural.adapter;

import java.io.File;

/**
 * @author mauricio.dimeni
 *
 * Adapter: a ação desse padrão convertea interface de uma classe
 * em outra, esperada pelo objetoi cliente. Através dessa conversão,
 * permite que classes com incompatibilidade de interfaces, consigam ser adaptadas
 * para que outros objetos possam trabalhar juntos.
 */
public class App {

    public static void main(String[] args) {
        String file = "teste.txt";

        Dropbox dropbox = new Dropbox();
        IPersitenciaDeArquivos arquivos = new DropboxAdapter(dropbox);
        arquivos.gravar(new File(file));

    }
}
