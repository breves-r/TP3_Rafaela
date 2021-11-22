package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.dominio.Pessoa;
import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Professor;
import br.edu.infnet.exceptions.NomeIncompletoException;
import br.edu.infnet.exceptions.SalarioNegativoException;

public class ControleAcademico {
	
	private static List<Pessoa> listaPessoa;
	private static int qtde = 0;
	public static final int QTDE_MAX = 100;

	
	private static void impressao(){
		System.out.println("---- Relatório de docentes/discentes ----");
		for(Pessoa p : listaPessoa) {
			p.impressao();
		}
	}
	
	public static void main(String[] args) {
		listaPessoa = new ArrayList<Pessoa>();
		
		int opcao = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar situação de um docente/discente");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair");
			System.out.print("Informe a opção desejada: ");
			
			try {
				opcao = Integer.valueOf(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida!!!");
				opcao = 5;
			}
			
			switch (opcao) {
			case 1:
				if(qtde < QTDE_MAX) {
					
					Professor prof = new Professor();
					
					try {
					System.out.print("Informe o seu nome completo: ");
					prof.setNome(in.nextLine());
					
					System.out.print("Informe o seu ano de nascimento: ");
					prof.setAnoNasc(in.nextInt());
					in.nextLine();
					
					System.out.print("Informe a sua disciplina: ");
					prof.setDisciplina(in.next());
					in.nextLine();
					
					System.out.print("Informe o seu salário: ");
					prof.setSalario(Float.valueOf(in.nextLine()));
					//in.nextLine();
					
					System.out.println("Professor registrado com o código " + qtde);
	                    
	                System.out.println("-----------------------------------");
					
					listaPessoa.add(prof);

					qtde++;
					
					} catch (NomeIncompletoException | SalarioNegativoException e) {
						System.out.println(e.getMessage());
					}
				} else {
					System.out.println("Impossível realizar o cadastramento!!!");
				}
				break;

			case 2:
				if(qtde < QTDE_MAX) {
					
					Aluno alu = new Aluno();
					try {
					System.out.print("Informe o seu nome completo: ");
					alu.setNome(in.nextLine());
					
					System.out.print("Informe o seu ano de nascimento: ");
					alu.setAnoNasc(in.nextInt());
					in.nextLine();
					
					System.out.print("Informe o período: ");
					alu.setPeriodo(in.nextInt());
					in.nextLine();
					
					System.out.print("Informe a nota da AV1: ");
					alu.setNotaAv1(in.nextFloat());
					in.nextLine();

					System.out.print("Informe a nota da AV2: ");
					alu.setNotaAv2(in.nextFloat());
					in.nextLine();
					
					System.out.println("Aluno registrado com o código " + qtde);
	                    
	                System.out.println("-----------------------------------");
					
					listaPessoa.add(alu);

					qtde++;
					
					} catch (NomeIncompletoException e) {
						System.out.println(e.getMessage());
					}
					
				} else {
					System.out.println("Impossível realizar o cadastramento!!!");
				}
				break;


			case 3:
				System.out.println("Informe o código: ");
				int codigo = in.nextInt();

				if(codigo >= 0 && codigo < qtde) {
					listaPessoa.get(codigo).impressao();
				} else {
					System.out.println("O código " + codigo + " é inválido!!");
				}				
				break;

			case 4:
				impressao();			
				break;

			case 5:
				System.out.println("sair");
				break;

			default:
				System.out.println("Opção inválida!!!");
				break;
			}			
		} while (opcao != 5);
		
		in.close();
		
		System.out.println("Processamento realizado!!!");
	}


	}
		
