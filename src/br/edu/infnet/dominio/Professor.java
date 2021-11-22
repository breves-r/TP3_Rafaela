package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.SalarioNegativoException;

public class Professor extends Pessoa {
	
	private String disciplina;
	private float salario;
	
	
	public void impressao() {
		super.impressao();
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Salário: " + salario);
		System.out.println("-----------------------------------");
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) throws SalarioNegativoException {
		if(salario <0) {
			throw new SalarioNegativoException("O salário não pode ser negativo!!");
		}
		this.salario = salario;
	}
	
	

}
