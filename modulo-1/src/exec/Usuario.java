package exec;

public class Usuario {
    private int codigo;
    private String nomeDeUsuario;
    private String email;
    private String senha;

    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @return
     */
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @param nomeDeUsuario
     */
    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método que imprimi uma mensagem de texto
     */
    public void imprimirMensagem() {
        System.out.println("Seja bem vindo!");
    }
}
