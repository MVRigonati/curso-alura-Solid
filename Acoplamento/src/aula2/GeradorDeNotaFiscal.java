package aula2;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcoesAposGerarNota> acoes;
	/*
	private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;
	*/
	
							/* EnviadorDeEmail email, NotaFiscalDao dao */
	public GeradorDeNotaFiscal(List<AcoesAposGerarNota> acoes) {
		this.acoes = acoes;
		/*
		this.email = email;
        this.dao = dao;
        */
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
		for (AcoesAposGerarNota acao : acoes) {
			acao.executa(nf);
		}
		/*
		email.enviaEmail(nf);
        dao.persiste(nf);
        */

		return nf;
		
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
	
}