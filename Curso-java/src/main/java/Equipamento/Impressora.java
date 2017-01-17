package Equipamento;

public class Impressora extends Eletronico{
    private int dpi;
    
    
	Impressora(double price, String fabricante,int dpi){
		super(price,fabricante);
		this.setDpi(dpi);
	}


	public int getDpi() {
		return dpi;
	}


	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	
	
}
