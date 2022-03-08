 package juego;

import java.util.ArrayList;
import java.util.Iterator;

public class Arena {
	public static int danoValor = 0;
	public static int cont = 0;
	public static ArrayList<Integer> listaAcuGolpe = new ArrayList<Integer>();
	
	public static void Lucha (Guerrero guer, Mago mag, int danoValor, ArrayList<Integer>listaAcuGol) {
		int golpeGuer = guer.metodoLucha();
		int golpeMag = mag.metodoHechizo();
		mag.setVida(mag.vida() - golpeGuer);
		guer.setVida(guer.vida() - golpeMag);
		
		danoValor = golpeGuer + golpeMag;
	
		System.out.println(" Acumulado de golpes: "+danoValor);
		
		//listaAcuGol.add(danoReferencia);
		listaAcuGol.add(Integer.valueOf(golpeGuer + golpeMag));
		
	}
	
	public static void main(String[] args) {
		
		
		Guerrero guer1 = new Guerrero();
		System.out.println (" Nivel de vida del Guerrero "+guer1.vida());
		//System.out.println("Daño "+guer1.metodoLucha());
		System.out.println(" ");
		
		Mago mag1 = new Mago();
		System.out.println(" Nivel de vida del Mago "+mag1.vida());
		//System.out.println("Daño "+mag1.metodoHechizo());
		
		System.out.println(" ");
		
		for (int i =0; i<4; i++){		
		Lucha (guer1, mag1, danoValor, listaAcuGolpe);
			cont ++;
			System.out.println("");
			System.out.println(" combate "+ cont);
			System.out.println (" Nivel de vida del Guerrero "+guer1.vida());
			System.out.println(" Nivel de vida del Mago "+mag1.vida());		
		}
		Iterator <Integer> iteInt = listaAcuGolpe.iterator();
		while (iteInt.hasNext()) {
			System.out.print(" "+iteInt.next() + " ");
		}
		System.out.println();
	}
}
