package br.com.banco.view;

import java.util.Scanner; // IMPORTANTE!

public class MenuBanco {
    // Inicialização do leitor
    private Scanner leitor = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("\n--- SISTEMA BANCÁRIO ---");
        System.out.println("1. Ver Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        try {
            // leitor.next() pega o que você digitou como texto
            // Integer.parseInt tenta transformar esse texto em número
            String entrada = leitor.next(); 
            return Integer.parseInt(entrada); 
            
        } catch (NumberFormatException e) {
            // Se o usuário digitou "abc", o parseInt falha e cai aqui
            return -1; // Retornamos -1 para o Controller saber que deu erro
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public double pedirValor() {
        System.out.print("DIGITE O VALOR: ");
        try {
        	String texto = leitor.next().replace(",", ".");
            return Double.parseDouble(leitor.next());
        } catch (NumberFormatException e) {
            System.out.println("VALOR INVÁLIDO! USANDO 0.0");
            return 0.0;
        }
    }
}