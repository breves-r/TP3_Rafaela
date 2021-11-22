package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.NomeIncompletoException;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private int anoNasc;
	
	
	public String getNome() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.ultimoNome.toUpperCase());
		sb.append(", ");
		sb.append(this.nome);
		sb.append(" ");
		sb.append(this.sobrenome);

		return sb.toString();
	}
	
	public void setNome(String nome) throws NomeIncompletoException {
		int posIni = nome.indexOf(" ");
		int posFim = nome.lastIndexOf(" ");
		
		if(posIni <= 0 && posFim <= 0) {
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto!");
		}
		
		this.nome = nome.substring(0, posIni);
		this.sobrenome = nome.substring(posIni, posFim).trim();
		this.ultimoNome = nome.substring(posFim).trim();
	}
	
	public int getIdade() {
		return 2021-anoNasc;
	}
	
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	
	public void impressao() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}
	

}
