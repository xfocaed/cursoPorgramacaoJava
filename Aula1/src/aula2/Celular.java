package aula2;

public class Celular {
	String modelo;
	String marca;
    String numeroSerie;
	Tela tela;
	Bateria bateria;

	public Celular(Tela t, String modelo, String marca, String numSerie, Bateria bateria)	
	{
		this.bateria = bateria;
		this.modelo = modelo;
		this.marca = marca;
		this.numeroSerie = numSerie;
		this.tela =t;
	}
		
	public void ligar() {
		if (bateria.carga < 10) {
			System.out.println("Carga muito baixa...");
		} else {
			System.out.println("Ligando celular...");
			tela.ligar();
		}
	}
    private void pausar()
    {
    	try { 
    	Thread.sleep(200);
    	}
    	
    	catch (InterruptedException e)
    	{
    		e.printStackTrace();
    	}
    }
	public void desligar() {
		
		tela.desligar();
		System.out.println("Desligando celular...");

	}

	public void carregar()
	{
		while (bateria.carga < bateria.capacidade)
		{
			bateria.carga++;
			System.out.println(bateria.carga +" %");
			pausar();
		}
		System.out.println("Carregado!");
	}
	public void fazerChamada() {

	}
}
