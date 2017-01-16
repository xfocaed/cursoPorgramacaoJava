package aula1;

import java.util.Scanner;

public class ComparacaoStrings {
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Entre com uma string:");		
     	String s1 = scanner1.nextLine();
     	
     	System.out.println("Entre com outra string:");		
     	String s2 = scanner1.nextLine();
     	
     	boolean b = s1==s2;
     	System.out.println("Resultado:" + b);		
        
     	b = s1.equals(s2);
     	
     	System.out.println("Resultado:" + b);		

	}

}
