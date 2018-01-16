package aula2;

public class EnviadorDeEmail implements AcoesAposGerarNota {

	public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
	
}
