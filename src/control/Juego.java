package control;

import java.awt.Color;
import java.util.LinkedList;

import modelo.Batallon;
import modelo.Coordenada;
import modelo.Ejercito;
import modelo.Medidas;
import modelo.Tablero;

public class Juego {

	private LinkedList<Ejercito> ejercitos = new LinkedList<Ejercito>();
	private Tablero tablero;
	private final Medidas medidasTablero = new Medidas(6, 12);
	private int idEjercitoActual = 0;
	private boolean localizarEstado = true;

	public Juego() {
		super();
		this.tablero = new Tablero(this.medidasTablero);
		ejercitos.add(new Ejercito(0));
		ejercitos.add(new Ejercito(1));
		agregarColorBatallones(ejercitos.get(0), Color.green);
		agregarColorBatallones(ejercitos.get(1), Color.yellow);
	}

	public boolean localizarBatallones(Coordenada coordenada) {
		boolean insertar = localizarEstado;
		if (insertar) {
			Ejercito ejercito = ejercitos.get(idEjercitoActual);
			if (insertar = validarCoordenada(idEjercitoActual, coordenada)) {

				Batallon batallonActual = ejercitos.get(idEjercitoActual).getBatallonActual();
				insertar = tablero.insertar(batallonActual, coordenada);
				if (insertar) {
					if (!ejercito.setSguienteBatallon()) {
						setSiguienteEjercito();
					}
				}
			}
		}
		return insertar;
	}

	private boolean validarCoordenada(int idEjercitoActual, Coordenada coordenada) {
		int maxY = 5, minY = 0;
		if (idEjercitoActual == 1) {
			maxY = 11;
			minY = 6;
		}
		return (coordenada.getY() >= minY && coordenada.getY() <= maxY);
	}

	public int getIdEjercitoActual() {
		return idEjercitoActual;
	}

	public void agregarColorBatallones(Ejercito ejercito, Color color) {
		ejercito.cambiaColorBatallones(color);
	}

	private void setSiguienteEjercito() {
		if (++idEjercitoActual == ejercitos.size()) {
			idEjercitoActual = 0;
			localizarEstado = false;
		}
	}

	public LinkedList<Ejercito> getEjercitos() {
		return ejercitos;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public boolean isLocalizarEstado() {
		return localizarEstado;
	}

	public Medidas getMedidasTablero() {
		return medidasTablero;
	}
}
