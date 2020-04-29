package modelo;

import vista.info.FichaInfo;

public class Tablero {
	private final Medidas medidasTablero;
	// Como tambien puede ser un castillo, habrá que remodelar esto
	private Matriz<Coordenada, Casilla> casillas;

	public Tablero(Medidas medidasTablero) {
		super();
		this.medidasTablero = new Medidas(medidasTablero.getAncho(), medidasTablero.getAlto());
		casillas = new Matriz<Coordenada, Casilla>(medidasTablero);
	}

	public Casilla getCasilla(Coordenada coordenada) {
		return casillas.getElement(coordenada);
	}

	public boolean insertar(Casilla casilla, Coordenada coordenada) {
		boolean response = false;
		if (!casillas.contieneElemento(casilla) && !casillas.contieneClave(coordenada)) {
			casillas.insertElement(coordenada, casilla);
			response = true;
		}
		return response;
	}

	public int getMedidasTableroAlto() {
		return medidasTablero.getAlto();
	}

	public int getMedidasTableroAncho() {
		return medidasTablero.getAncho();
	}

	private boolean validarCoordenada(int idEjercitoActual, Coordenada coordenada) {
		byte maxY = 5, minY = 0;
		if (idEjercitoActual > 0) {
			maxY = 11;
			minY = 6;
		}
		if (coordenada.getY() >= minY || coordenada.getY() <= maxY) {
			return true;
		}
		return false;
	}
}
