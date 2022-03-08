package juego;

public class Mago extends Personaje {

	private int magia;
	
	Mago(){
		magia = 10;
		System.out.println(" Mago --> Constructor");

	}

	public int metodoHechizo (){
		int golpe;
		golpe = (int)(Math.random()*this.magia);
		System.out.println(" ***Hechizo*** golpe: "+golpe);
		return golpe;
	}
}
