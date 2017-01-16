package Usuario;

public class TestaValidador {

	public static void main(String[] args) {
		
		String senhaValida = "abc123456";
		String senhaMenorMinimo = "abc12";
		String senhaSemLetra = "123457";
		String senhaSemNumero = "abcdefg";
		
		System.out.println(senhaValida + " :" + ValidadorSenha.validarSenha(senhaValida));
		System.out.println(senhaMenorMinimo + " :" + ValidadorSenha.validarSenha(senhaMenorMinimo));
		System.out.println(senhaSemLetra + " :" + ValidadorSenha.validarSenha(senhaSemLetra));
		System.out.println(senhaValida + " :" + ValidadorSenha.validarSenha(senhaSemNumero));

		
	}
}
