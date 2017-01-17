package Aula6;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	PessoaJuridica(String nome, String cnpj)
	{
		super(nome);
		setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
