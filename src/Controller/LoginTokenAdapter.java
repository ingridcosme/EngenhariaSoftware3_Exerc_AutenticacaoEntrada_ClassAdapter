package Controller;

import Model.Autenticacao;

public class LoginTokenAdapter implements IServicoAutenticacao {

	LoginToken loginT;
	
    public LoginTokenAdapter(LoginToken loginT) {
        this.loginT = loginT;
    }

    @Override
    public void autenticar(Autenticacao autenticacao) {
        loginT.enviarToken(autenticacao.getToken().getToken());
    }

}