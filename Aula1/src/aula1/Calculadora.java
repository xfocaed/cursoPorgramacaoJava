package aula1;

import java.util.Scanner;

public class Calculadora {
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Entre com o primeiro numero:");
		num1 = leitor.nextInt();
		System.out.println("Entre com o segundo numero:");
		num2 = leitor.nextInt();
		
		
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
		System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
		System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
		System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
		System.out.println(num1 + "%" + num2 + " = " + (num1%num2));

		leitor.close();
	}

}
