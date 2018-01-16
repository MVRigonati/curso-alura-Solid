package OCP;

public class Compra {

	private double valor;
	private String cidade;
	
	public Compra(double valor) {
		this.valor = valor;
	}
	
	public Compra(double valor, String cidade) {
		this.valor = valor;
		this.cidade = cidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}