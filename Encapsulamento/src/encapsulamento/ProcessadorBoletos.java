package encapsulamento;

import java.util.List;

public class ProcessadorBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {

		/*
        double total = 0;
        */
        
        for(Boleto boleto : boletos) {
        	
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);
            
            fatura.adicionaParagamento(pagamento);

            /*
            total += boleto.getValor();
            */
            
        }

        /*
        if(total >= fatura.getValor()) {
            fatura.setPago(true);
        }
        */
        
    }
	
}
