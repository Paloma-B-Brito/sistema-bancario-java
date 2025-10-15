package br.com.banco.model;

import java.util.Scanner;

public class contaCliente {

	String nome;
	int cpf;
	int numeroConta;
	int senhaConta;

	private void alterarDadosdaConta() {

		Scanner leitor = new Scanner(System.in);

		int modificarSenhaConta1, modificarSenhaConta2;

		System.out.println("Digite os números da sua nova senha: ");
		modificarSenhaConta1 = leitor.nextInt();
		System.out.println("Digite novamente os números da sua nova senha: ");
		modificarSenhaConta2 = leitor.nextInt();

		if (modificarSenhaConta1 != modificarSenhaConta2) {

			while (modificarSenhaConta1 != modificarSenhaConta2) {
				System.out.println("SENHAS DIFERENTES! /n");
				System.out.println("Digite os números da sua nova senha: ");
				modificarSenhaConta1 = leitor.nextInt();
				System.out.println("Digite novamente os números da sua nova senha: ");
				modificarSenhaConta2 = leitor.nextInt();
			}

		} else {
			System.out.println("Senha alterada com sucesso!");
		}

	}

	private void verDadosconta() {
		System.out.println(senhaConta);
		System.out.println(cpf);
	}
}
