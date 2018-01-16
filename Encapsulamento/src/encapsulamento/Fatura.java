package encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

	private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        
    	/*
    	return pagamentos;
    	*/
    	
    	// A lista será retornada apenas para leitura, não recebera nenhuma alteração
    	return Collections.unmodifiableList(this.pagamentos);
    	
    }

    public boolean isPago() {
        return pago;
    }
    
    public void adicionaParagamento(Pagamento pagamento) {
    	this.pagamentos.add(pagamento);
    	marcaFaturaComoPaga();
    }

	public void marcaFaturaComoPaga() {
    	
		if (valorTotalPagamentos() > this.valor) {
    		this.pago = true;
    	}
    	
    }
	
	private double valorTotalPagamentos() {
		
		double total = 0;
		for (Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
		}
		return total;
		
	}

    /*
    public void setPago(boolean pago) {
        this.pago = pago;
    }
	*/
    
}
