package aula2;

public class TestaCarro {

	public static void main(String[] args) {

		Carro meuCarro = new Carro("EYO8336", "Mitsubish", "Kiai", "2017",180);
        
		meuCarro.ligarCarro();
		for (int i=0; i < 200; i++)
		 meuCarro.acelerar();

		meuCarro.frear();
		meuCarro.frear();

		meuCarro.mostrarCarro();

	}

}
