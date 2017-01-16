package aula2;

public class Conta {

	int saldo;	
	
	public boolean sacar(int valor)
	{
		if (this.saldo < valor) {
			return false;
		}
		else { saldo -= valor; return true; }
	}
	
	public void depositar(int valor)
	{
		saldo += valor;
	}
	
	public int obterSaldo()
	{
		return this.saldo;
	}
}
