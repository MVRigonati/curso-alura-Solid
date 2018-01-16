package substitutivePrinciple;

public class ContaComum {

	/*
	protected double saldo;
    */
    
	private GerenciadorSaldo saldo;

    public ContaComum() {
    	
    	/*
    	this.saldo = 0;
    	*/
    	
        this.saldo = new GerenciadorSaldo();
        
    }
    
    public void deposita(double valor) {
    	
    	/*
        this.saldo += valor;
        */
    	
    	saldo.deposita(valor);
        
    }

    public void rende() {
    	
    	/*
    	this.saldo += this.saldo * 0.01;
    	*/
    	
        this.saldo.rende(1.01);
        
    }
    
    public double getSaldo() {
    	
    	/*
        return saldo;
        */
    	
    	return this.saldo.getSaldo();
        
    }
    
    public void saca(double valor) {
    	
    	/*
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
        */
    	
    	this.saldo.saca(valor);
        
    }
	
}