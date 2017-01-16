package aula2;

import java.util.Scanner;

public class ContaUi {

	public static void main(String[] args) {

		Conta conta = new Conta();

		System.out.println("Entre com uma opção:");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Saldo");
		System.out.println("4 - Sair");
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();

		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("Entre com o valor de saque:");
				int valor = leitor.nextInt();
				boolean sacou = conta.sacar(valor);

				if (sacou) {
					System.out.println("Saque efetuado!");
				} else {
					System.out.println("Saque nao permitido");
				}
			}
			
			if (opcao == 2) {
				System.out.println("Entre com o valor do deposito:");
				int valor = leitor.nextInt();
				conta.depositar(valor);
				System.out.println("Deposito efetuado!");
			}
			
			if (opcao == 3) {
				System.out.println("Seu saldo é : " + conta.obterSaldo());
			}
		}
	}

}
