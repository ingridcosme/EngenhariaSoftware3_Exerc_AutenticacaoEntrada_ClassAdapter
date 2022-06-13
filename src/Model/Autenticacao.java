package Model;

public class Autenticacao {

    private Usuario usuario;
    private Chave codigoConfirmacao;
    private Token token;
    private NumeroGoogle numeroConfirmacao;
	
    public Usuario getUsuario() {
		return usuario;
	}
	
    public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
    public Chave getCodigoConfirmacao() {
		return codigoConfirmacao;
	}
	
    public void setCodigoConfirmacao(Chave codigoConfirmacao) {
		this.codigoConfirmacao = codigoConfirmacao;
	}
	
    public Token getToken() {
		return token;
	}
	
    public void setToken(Token token) {
		this.token = token;
	}
	
    public NumeroGoogle getNumeroConfirmacao() {
		return numeroConfirmacao;
	}
	
    public void setNumeroConfirmacao(NumeroGoogle numeroConfirmacao) {
		this.numeroConfirmacao = numeroConfirmacao;
	}

	@Override
	public String toString() {
		return "Autenticacao [usuario=" + usuario + ", codigoConfirmacao=" + codigoConfirmacao + ", token=" + token
				+ ", numeroConfirmacao=" + numeroConfirmacao + "]";
	}

}