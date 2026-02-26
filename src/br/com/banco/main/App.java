package br.com.banco.main;

import br.com.banco.controller.BancoController;
import br.com.banco.model.ContaBancaria;
import br.com.banco.view.MenuBanco;

public class App {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Seu Nome", 500.0);
		MenuBanco menu = new MenuBanco();
		BancoController controller = new BancoController(conta, menu);
		controller.iniciar();
	}
}
