package br.com.keith.stractural.adapter;

import java.io.File;

public class DropboxAdapter implements IPersitenciaDeArquivos {

    private Dropbox dropbox;

    public DropboxAdapter(Dropbox dropbox) {
        this.dropbox = dropbox;
    }

    /**
     * @param file
     */
    @Override
    public void gravar(File file) {
        dropbox.upload(file.getAbsolutePath());
    }

    /**
     * @param path
     */
    @Override
    public File ler(String path) {
        DropboxFile file = dropbox.download(path);
        return new File(file.getLocalPath());

    }
}
