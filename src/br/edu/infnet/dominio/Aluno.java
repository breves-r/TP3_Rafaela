package br.edu.infnet.dominio;

public class Aluno extends Pessoa {
	private int periodo;
	private float notaAv1;
	private float notaAv2;
	
	public void impressao() {
		super.impressao();
		System.out.println("Período: " + periodo);
		System.out.println("Média: " + calcularMedia());
		System.out.println("-----------------------------------");
	}
	
	private float calcularMedia() {
		return (notaAv1 + notaAv2) / 2;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public float getNotaAv1() {
		return notaAv1;
	}

	public void setNotaAv1(float notaAv1) {
		this.notaAv1 = notaAv1;
	}

	public float getNotaAv2() {
		return notaAv2;
	}

	public void setNotaAv2(float notaAv2) {
		this.notaAv2 = notaAv2;
	}
	

}
