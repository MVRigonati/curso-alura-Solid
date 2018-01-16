package aula1;

public class DezOuVintePorcento implements FuncionarioRegra {

	public double calcula(Funcionario funcionario) {

		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}

	}

}
