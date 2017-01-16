package Usuario;

public class TestaUsuario {
	
	public static void main(String[] args) {
		Usuario user = new Usuario("Admin","Admin","Admin");
		
		user.setEmail("carlos.lemos@dex.com");
		user.setSenha("abc6");
		user.setLogin("XFOCAED");
		
		System.out.println(user.getLogin() + " " +
		 user.getEmail() + " " + user.getSenha());
		
	}

}
