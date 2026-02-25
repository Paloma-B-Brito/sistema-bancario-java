package br.com.banco.main;

import br.com.banco.controller.BancoController;

public class App {
	public static void main(String[] args) {
		BancoController sistema = new BancoController();
		sistema.iniciar();
	}
}
