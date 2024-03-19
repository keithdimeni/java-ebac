package exec;

/**
 * @author Maurício Dimeni
 */
public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setCodigo(1);
        usuario.setNomeDeUsuario("keithdimeni");
        usuario.setEmail("keithdimeni@gmail.com");
        usuario.setSenha("887hugjh5yy6540");

        usuario.imprimirMensagem();
        System.out.println(usuario.getNomeDeUsuario());
    }
}
