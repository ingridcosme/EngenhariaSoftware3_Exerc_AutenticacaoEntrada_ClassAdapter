package Controller;

import Model.Autenticacao;

public class LoginDuasEtapasAdapter implements IServicoAutenticacao {

	LoginDuasEtapas loginDE;
	
    public LoginDuasEtapasAdapter(LoginDuasEtapas loginDE) {
        this.loginDE = loginDE;
    }

	@Override
	public void autenticar(Autenticacao autenticacao) {
		loginDE.fazerLogin(autenticacao.getUsuario().getNome(), autenticacao.getUsuario().getSenha());
		loginDE.confirmaSegundaEtapa(autenticacao.getCodigoConfirmacao().getCodigoConfirmacao());
	}

}