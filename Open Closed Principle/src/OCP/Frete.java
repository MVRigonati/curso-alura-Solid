package OCP;

public class Frete implements ServicoEntrega {

	public double para(String cidade) {

		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;

	}

}