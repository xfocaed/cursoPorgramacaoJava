package aula1;

import java.util.Scanner;

public class JogoParImpar {
	
	
	public static void main(String[] args) {
	
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Entre com o nome do jogador1:");
		 String jog1 = leitor.next();
		 System.out.println("Entre com o valor do jogador1:");
		 int val1 = leitor.nextInt();
		 
		 System.out.println("Entre com o nome do jogador2:");
		 String jog2 = leitor.next();
		 System.out.println("Entre com o valor do jogador2:");
		 int val2 = leitor.nextInt();

         String msg = ((val1+val2)%2== 0 ) ? "O jogador 1 ganhou! Resultado: " + (val1+val2)
        		                     : "O jogador 2 ganhou! Resultado: " + (val1+val2);
         
         System.out.println(msg);
	}

}
