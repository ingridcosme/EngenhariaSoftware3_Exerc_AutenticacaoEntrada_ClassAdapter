package Controller;

public class LoginGoogle {

	public void fazerLogin(String nome, String senha) {
		System.out.println("Login realizado! Usuário: " + nome);
	}
	
	public void enviarNumero(int numeroConfirmacao) {
		System.out.println("Usuário autenticado com o número: " + numeroConfirmacao);
	}
}
