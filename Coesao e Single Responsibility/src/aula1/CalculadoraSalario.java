package aula1;

public class CalculadoraSalario {

	public double calcula(Funcionario funcionario) {
		
		return funcionario.calculaSalario();
		
		/*
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return new DezOuVintePorcento().calcula(funcionario);
		}

		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return new QuinzeOuVinteCincoPorcento().calcula(funcionario);
		}

		throw new RuntimeException("funcionario invalido");
		*/
		
	}

	/*
	private double dezOuVintePorcento(Funcionario funcionario) {
		
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
		
	}

	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
		
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
		
	}
	*/

}
