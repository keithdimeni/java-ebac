public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cliente cliente = new Cliente();
        System.out.println(cliente.getEndereco());
        cliente.cadastrarEndreco("Ruas das palmeiras");
        cliente.setCodigo(1);
//        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();
        String nome = cliente.retornarNomeCliente();
        System.out.println(nome);
        System.out.println(cliente.valorTotal());
    }
}
