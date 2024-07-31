package br.com.keith.stractural.adapter;

import java.io.File;

public interface IPersitenciaDeArquivos  {

    public void gravar(File file);

    public File ler(String path);
}
