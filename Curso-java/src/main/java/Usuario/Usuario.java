package Usuario;

public class Usuario {

	private String senha;
	private String email;
	private String login;

	public Usuario(String senha, String email, String login) {
		this.setSenha(senha);
		this.setEmail(email);
		this.setLogin(login);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {

		if (!ValidadorSenha.validarSenha(senha)) {
           throw new IllegalArgumentException("Senha Invalida");
		}
		
		this.senha = senha;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
