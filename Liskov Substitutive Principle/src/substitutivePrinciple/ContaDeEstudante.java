package substitutivePrinciple;

public class ContaDeEstudante /*extends ContaComum*/ {

	private GerenciadorSaldo saldo;
	private int milhas;

    public void deposita(double valor) {
        
    	/*
    	super.deposita(valor);
        */
    	
    	this.saldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    /*
    public void rende() {
        throw new RuntimeException("Não pode render");
    }
	*/

    public double getSaldo() {
    	return this.saldo.getSaldo();
    }
    
    public void saca(double valor) {
    	this.saldo.saca(valor);
    }
    
}