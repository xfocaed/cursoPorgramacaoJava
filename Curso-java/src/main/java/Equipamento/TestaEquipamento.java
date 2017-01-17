package Equipamento;

public class TestaEquipamento {

	
	public static void main(String[] args) {
		
		Impressora printer = new Impressora(959.98,"Epson",500);
		Televisao tv = new Televisao(1000,"Samsung",55);
		Cadeira chair = new Cadeira(15.00,"Todeschini","Aluminio");
		
		System.out.println("Impressora custa " + printer.calcularPrecoFinal());
		System.out.println("Televisao custa " + tv.calcularPrecoFinal());
		System.out.println("Cadeira custa " + chair.calcularPrecoFinal());

	}
}
