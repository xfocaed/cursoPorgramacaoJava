package aula1;

import java.util.Scanner;

public class JogoFutebol {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com o nome do seu time:");
		String meuTime = leitor.nextLine();
		
		System.out.println("Entre com o nome do time adversário:");
		String seuTime = leitor.nextLine();
		
		System.out.println("Entre com a quantidade de jogos entre os times:");
		int jogos = leitor.nextInt();
		
		int vitoriasMeuTime = 0, vitoriasSeuTime = 0;
		int saldoGolsMeutime = 0, saldoGolsSeuTime=0;
		
		for(int i=1; i <=jogos; i++)
		{
			System.out.println("Entre com o placar do jogo " + i);
			System.out.println(meuTime + " :");
			int golsMeuTime = leitor.nextInt();
			System.out.println(seuTime + " :");
			int golsSeuTime = leitor.nextInt();
			
			if (golsMeuTime > golsSeuTime) {
				vitoriasMeuTime++;
				saldoGolsMeutime = golsMeuTime + saldoGolsMeutime;
				saldoGolsSeuTime = saldoGolsSeuTime + golsSeuTime;
			}
			
			else {
      				vitoriasSeuTime++;
      				saldoGolsMeutime = golsMeuTime + saldoGolsMeutime;
    				saldoGolsSeuTime = saldoGolsSeuTime + golsSeuTime;

			}
			
            System.out.println("Placar do jogo "+ i + " é :" + golsMeuTime + " x " + golsSeuTime);
		}  
		
		System.out.println("O numero de vitórias do time " + meuTime + " é " + vitoriasMeuTime );
		System.out.println("O numero de vitórias do time " + seuTime + " é " + vitoriasSeuTime );
		System.out.println("O saldo de gols do time " + meuTime + " é " + (saldoGolsMeutime - saldoGolsSeuTime));
		System.out.println("O saldo de gols do time " + seuTime + " é " + (saldoGolsSeuTime - saldoGolsMeutime));

	}

}
