package Aula6;

public class TestaHerancaPessoa {

	
	public static void main(String[] args) {
		
		Pessoa person = new Pessoa();
		PessoaFisica personF = new PessoaFisica("Pessoa");
		PessoaJuridica personJ = new PessoaJuridica("Dextra","122.333.45/123");
		person.setNome("Pessoa");
		personF.setNome("Pessoa fisica");
		personJ.setNome("Pessoa Juridica");
		
		personF.setCpf("111.222.333.44");
		personJ.setCnpj("122.333.45/123");
		
		System.out.println(person);
		System.out.println(personF +" " + personF.getCpf());
		System.out.println(personJ +" " + personJ.getCnpj());
	}
}
