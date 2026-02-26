package br.com.banco.controller;

import br.com.banco.model.*;
import br.com.banco.view.*;

public class BancoController {
	private ContaBancaria conta;
	private MenuBanco menu;
	
	public BancoController(ContaBancaria conta, MenuBanco menu) {
		this.conta = conta;
		this.menu = menu;
	}
	
	public void iniciar() {
		int opcao = 0;
		while (opcao != 4 ) {
			opcao = menu.exibirMenu();
			
			switch (opcao) {
			case 1: 
				menu.mostrarMensagem("Saldo atual: R$ " + conta.getSaldo());
				break;
				
			case 2: 
				double valorDeposito = menu.pedirValor();
					if (conta.depositar(valorDeposito)) {
						menu.mostrarMensagem("DEPÓSITO REALIZADO!");
					} else {
						menu.mostrarMensagem("DEPÓSITO INVÁLIDO! DIGITE UM VALOR POSITIVO.");
					}
				break;
			case 3: 
				double valorSaque = menu.pedirValor();
					try {
						conta.sacar(valorSaque);
						menu.mostrarMensagem("Saque processado!");
					} catch (IllegalArgumentException e) {
						// Se o Model "gritar", o Controller pega o erro aqui
						menu.mostrarMensagem("ERRO NO SAQUE: " + e.getMessage());
					} catch (SaldoInsuficienteException e) {
						menu.mostrarMensagem("ERRO NO SAQUE: " + e.getMessage());					
						}
				break;
			case 4: 
				menu.mostrarMensagem("Encerrando sistema...");
				break;
			default: 
				menu.mostrarMensagem("Opção inválida!");
			}
		}
	}
		
}
