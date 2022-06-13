package Model;

public class AutenticacaoBuilder {

    private Usuario usuario;
    private Autenticacao autenticacao;
    private Chave codigo;
    private Token token;
    private NumeroGoogle numero;

    public AutenticacaoBuilder() {
    	this.usuario = new Usuario();
		this.autenticacao = new Autenticacao();
		this.codigo = new Chave();
		this.token = new Token();
		this.numero = new NumeroGoogle();
    }

    public static AutenticacaoBuilder builder() {
    	return new AutenticacaoBuilder();
    }

    public AutenticacaoBuilder addUsuario(int id, String nome) {
    	this.usuario.setId(id);
		this.usuario.setNome(nome);
		return this;
    }

    public AutenticacaoBuilder addSenha(String senha) {
        this.usuario.setSenha(senha);
        return this;
    }

    public AutenticacaoBuilder addChave(int codigoConfirmacao) {
    	this.codigo.setCodigoConfirmacao(codigoConfirmacao);
        return this;
    }

    public AutenticacaoBuilder addToken(long token) {
    	this.token.setToken(token);
    	return this;
    }

    public AutenticacaoBuilder addNumeroGoogle(int numeroConfirmacao) {
        this.numero.setNumeroConfirmacao(numeroConfirmacao);
        return this;
    }

    public Autenticacao get() {
        this.autenticacao.setUsuario(usuario);
        this.autenticacao.setCodigoConfirmacao(codigo);
        this.autenticacao.setNumeroConfirmacao(numero);
        this.autenticacao.setToken(token);
        return autenticacao;
    }

}