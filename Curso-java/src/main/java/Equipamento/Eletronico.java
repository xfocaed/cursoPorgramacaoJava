package Equipamento;

public class Eletronico extends Equipamento {
	
	public Eletronico(double price, String fabricante)
	{
		super(price,fabricante);
	}
	
    public double calcularPrecoFinal()
    {
    	return super.getPreco()*1.10;
    }
}
