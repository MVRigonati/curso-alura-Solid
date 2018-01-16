package aula1;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());
	
	private FuncionarioRegra regra;

	Cargo(FuncionarioRegra regra) {
		this.regra = regra;
	}
	
	public FuncionarioRegra getRegra() {
		return regra;
	}
	
}