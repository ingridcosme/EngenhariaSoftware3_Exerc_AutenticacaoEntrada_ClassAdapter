package Controller;

public class LoginDuasEtapas {

    public void fazerLogin(String nome, String senha) {
    	System.out.println("Login realizado! Usu�rio: " + nome);
    }

    public void confirmaSegundaEtapa(int chaveConfirmacao) {
    	System.out.println("Usu�rio autenticado com a chave: " + chaveConfirmacao);
    }

}