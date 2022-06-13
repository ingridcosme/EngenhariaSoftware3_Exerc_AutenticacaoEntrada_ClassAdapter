package View;

import Controller.IServicoAutenticacao;
import Controller.LoginDuasEtapas;
import Controller.LoginDuasEtapasAdapter;
import Controller.LoginGoogle;
import Controller.LoginGoogleAdapter;
import Controller.LoginToken;
import Controller.LoginTokenAdapter;
import Model.Autenticacao;
import Model.AutenticacaoBuilder;

public class Principal {

    public static void main(String[] args) {
		Autenticacao autenticacao = AutenticacaoBuilder.builder()
				.addUsuario(140, "ingridsantos")
				.addSenha("123456A")
				.addNumeroGoogle(258964)
				.get();
		
		LoginGoogle loginG = new LoginGoogle();
		IServicoAutenticacao servicoAutent = new LoginGoogleAdapter(loginG);
		servicoAutent.autenticar(autenticacao);
		
		autenticacao = AutenticacaoBuilder.builder()
				.addUsuario(140, "ingridsantos")
				.addToken(95526)
				.get();
		
		LoginToken loginT = new LoginToken();
		servicoAutent = new LoginTokenAdapter(loginT);
		servicoAutent.autenticar(autenticacao);
		
		autenticacao = AutenticacaoBuilder.builder()
				.addUsuario(140, "ingridsantos")
				.addSenha("123456A")
				.addChave(214669)
				.get();
		
		LoginDuasEtapas loginC = new LoginDuasEtapas();
		servicoAutent = new LoginDuasEtapasAdapter(loginC);
		servicoAutent.autenticar(autenticacao);
	}

}