package Aula6;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String n, String cpf) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
