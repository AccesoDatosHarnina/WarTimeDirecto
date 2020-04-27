package control;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import modelo.Batallon;
import modelo.Ejercito;
import modelo.Especialidad;
import modelo.Medidas;
import modelo.Soldado;
import modelo.Tablero;
import modelo.Tipo;

public class Juego {

	private Ejercito ejercitoA;
	private Ejercito ejercitoB;
	private Tablero tablero;
	private Stack<Batallon> batallonesColocacion = new Stack<Batallon>();
	private final Medidas medidasTablero = new Medidas(6, 12);

	public Juego(LinkedList<Batallon> batallonesEjercitoA, LinkedList<Batallon> BatallonesEjercitoB) {
		super();
		rellenarEjercitos(batallonesEjercitoA, BatallonesEjercitoB);
		llenarBatallonesAcolocar();
		this.tablero = new Tablero(this.medidasTablero);
	}

	private void rellenarEjercitos(LinkedList<Batallon> batallonesEjercitoA, LinkedList<Batallon> BatallonesEjercitoB) {
		this.ejercitoA = new Ejercito(0, batallonesEjercitoA);
		this.ejercitoB = new Ejercito(1, BatallonesEjercitoB);
	}

	public Stack<Batallon> getBatallonesColocacion() {
		return batallonesColocacion;
	}

	private void llenarBatallonesAcolocar() {
		for (Batallon batallon : ejercitoA.getGroup()) {
			batallonesColocacion.push(batallon);
		}
		for (Batallon batallon2 : ejercitoB.getGroup()) {
			batallonesColocacion.push(batallon2);
		}

	}

	public Tablero getTablero() {
		return tablero;
	}

}
