package one.digitalinnovation.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new SuperUsuario(login:"root", senha:"12345");

        superUsuario.getLogin();
        superUsuario.getSenha();

        String root = superUsuario.nome;

    }
}
