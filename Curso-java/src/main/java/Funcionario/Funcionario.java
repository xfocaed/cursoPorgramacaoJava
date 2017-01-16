package Funcionario;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;
	
	public Funcionario(String nome, double salario, String cargo,
			double porcentagemBonificacao) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setCargo(cargo);
		this.setPorcentagemBonificacao(porcentagemBonificacao);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (this.salario > salario)
			throw new IllegalArgumentException("Novo salario menor que atual!");
		
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		if (this.porcentagemBonificacao > porcentagemBonificacao)
			throw new IllegalArgumentException("Nova bonificação menor que atual!");

		this.porcentagemBonificacao = porcentagemBonificacao;
	}

}
