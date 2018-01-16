package OCP;

public class CalculadoraDePrecos {

	private TabelaDePrecos tabela;
	private ServicoEntrega correios;

	public CalculadoraDePrecos(TabelaDePrecos tabela, ServicoEntrega correios) {
		this.tabela = tabela;
		this.correios = correios;
	}
	
	public double calcula(Compra produto) {

		/*
		TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
		Frete correios = new Frete();
		*/

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;

	}

}