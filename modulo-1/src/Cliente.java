public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndreco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Maurício Dimeni";
    }

    public int valorTotal() {
        return 20;
    }

}
