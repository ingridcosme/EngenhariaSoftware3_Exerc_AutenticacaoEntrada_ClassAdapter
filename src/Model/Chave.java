package Model;

public class Chave {

    private int codigoConfirmacao;

	public int getCodigoConfirmacao() {
		return codigoConfirmacao;
	}

	public void setCodigoConfirmacao(int codigoConfirmacao) {
		this.codigoConfirmacao = codigoConfirmacao;
	}

	@Override
	public String toString() {
		return "Chave [codigoConfirmacao=" + codigoConfirmacao + "]";
	}

}