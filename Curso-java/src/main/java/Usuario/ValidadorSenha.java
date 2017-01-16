package Usuario;

public class ValidadorSenha {
	
	public static boolean validarSenha(String senha)
	{
		if (senha.length() < 6)
		{
			return false;
		} 
		
		if (!contemNumero(senha))
		{
			return false;
		}
		
		if (!contemLetra(senha))
		{
			return false;
		}
		return true;
		
	}

	private static boolean contemLetra(String senha) {
		
		for(char digito : senha.toCharArray())
		{
			if(Character.isLetter(digito)) {
				return true;
			}
		}
		return false;
	}

	private static boolean contemNumero(String senha) {
		for(char digito : senha.toCharArray())
		{
			if(Character.isDigit(digito)) {
				return true;
			}
		}
		return false;	}

}
