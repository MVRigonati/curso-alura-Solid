package substitutivePrinciple;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (ContaComum conta : contasComunsDoBanco()) {
        	
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
            
        }
        
        for (ContaDeEstudante conta : contasEstudantesDoBanco()) {
            System.out.println("Saldo:");
            System.out.println(conta.getSaldo());
        }
        
    }

    private static List<ContaComum> contasComunsDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200));
    }
    
    private static List<ContaDeEstudante> contasEstudantesDoBanco() {
        return Arrays.asList(contaDeEstudanteCom(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
	
}