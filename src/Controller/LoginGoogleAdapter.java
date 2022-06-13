package Controller;

import Model.Autenticacao;

public class LoginGoogleAdapter implements IServicoAutenticacao {

	LoginGoogle loginG;
	
	public LoginGoogleAdapter(LoginGoogle loginG) {
		this.loginG = loginG;
	}
	
	@Override
	public void autenticar(Autenticacao autenticacao) {
		loginG.fazerLogin(autenticacao.getUsuario().getNome(), autenticacao.getUsuario().getSenha());
		loginG.enviarNumero(autenticacao.getNumeroConfirmacao().getNumeroConfirmacao());
	}

}
