package aula2;

public class Carro {
	String marca;
	String placa;
	String modelo;
	String anoFabricacao;
	double velocidadeAtual;
	int velocidadeMax;
	boolean ligado;

	public Carro(String placa, String marca, String modelo,
			String anoFabricacao, int vel) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeAtual = 0;
		this.velocidadeMax = vel;
		this.ligado=false;
	}

	public void mostrarCarro() {
		System.out.println(modelo + " " + marca + " " + placa + " ");
		System.out.println("Velocidade atual é " + velocidadeAtual);
	}

	public void ligarCarro(){
		this.ligado =true;
	}
	
	public void desligarCarro(){
		this.ligado =false;
	}
	public void acelerar() {
		if (ligado && velocidadeAtual < velocidadeMax) {
			this.velocidadeAtual += 5;
		}
	}

	public void frear() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}
	}
}