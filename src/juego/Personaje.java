package juego;

public abstract class Personaje {
	private final int VIDA_INICIAL = 100;
	private int vida;
	
	//Constructor 
	Personaje () {
		vida = 100;	
		System.out.println(" Personaje --> Constructor");

	}
	
	public void setVida (int vida) {
		this.vida = vida;
	}
	
	public int vida () {
		return vida;
	}
	
	public abstract int metodoLucha ();
	
	
		
}
