package Equipamento;

public class Cadeira extends Equipamento {
private String material;

	Cadeira(double price, String fabricante, String material){
		super(price,fabricante);
		this.setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
