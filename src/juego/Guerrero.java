package juego;

public class Guerrero extends Personaje {

	private int ataque;
	
	Guerrero(){
		ataque = 10;
		System.out.println(" Guerrero --> Constructor");

	}

	public int metodoLucha (){
		int golpe;
		golpe = (int)(Math.random()*this.ataque);
		System.out.println(" ***Espadazo*** golpe: "+golpe);
		return golpe;
	}
}
