package control;

import modelo.Coordenada;

public class Movedor implements Ponedor {

	@Override
	public boolean poner(Juego juego,Coordenada coordenada) {
		System.out.println(" estoy moviendo ");
		return false;
	}

}
