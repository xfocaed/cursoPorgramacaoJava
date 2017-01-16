package aula2;

public class TestaCelular {
	
	public static void main(String[] args) {
		Tela tela = new Tela(800,600);
		Bateria bateria = new Bateria();
		
		Bateria bateriaSony = new Bateria();
		Tela telaSony = new Tela(1024,768);

		Celular cel = new Celular(tela,"Nokia","6","1a1q1q111",bateria);
		Celular cel2 = new Celular(telaSony,"Sony","Experia","1a1q1q22",bateriaSony);			
		
		cel.carregar();
		cel.ligar();
		
		
	}

}
