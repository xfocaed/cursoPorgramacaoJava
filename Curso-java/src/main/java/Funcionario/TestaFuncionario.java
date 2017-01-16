package Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Carlos",10000, "Eng",25);
		
		funcionario.setSalario(9000);
		funcionario.setPorcentagemBonificacao(20);
	}

}
