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

	public void insertar(Batallon batallon, Coordenada coordenada) {
		casillas.insertElement(coordenada, batallon);
	}

	public void insertar(Casilla casilla, Coordenada coordenada) {
		casillas.insertElement(coordenada, casilla);
	}
}
