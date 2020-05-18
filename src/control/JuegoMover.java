package control;

import modelo.Coordenada;

public class JuegoMover extends Juego {

	public JuegoMover(Juego juego) {
		super(juego);
	}
	

	public JuegoMover(int ancho, int alto) {
		super(ancho, alto);
	}


	@Override
	public boolean poner(Coordenada coordenada) {
		System.out.println("soy mover");
		return false;
	}

}
