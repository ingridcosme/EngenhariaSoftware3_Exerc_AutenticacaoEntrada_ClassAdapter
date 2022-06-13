package Controller;

public class LoginDuasEtapas {

    public void fazerLogin(String nome, String senha) {
    	System.out.println("Login realizado! Usuário: " + nome);
    }

    public void confirmaSegundaEtapa(int chaveConfirmacao) {
    	System.out.println("Usuário autenticado com a chave: " + chaveConfirmacao);
    }

}