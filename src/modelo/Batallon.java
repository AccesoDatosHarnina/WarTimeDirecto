package modelo;

import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;

public class Batallon implements Casilla {
	private int id;
	private final int maximoSoldados = 10;
	private Tipo tipo;
	private LinkedList<Soldado> soldados = new LinkedList<Soldado>();
	private Color colorAtacante;

	public Batallon(int id, Tipo tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

	public Batallon(int id, Tipo tipo, LinkedList<Soldado> soldados, Color colorEjercitoAtacante) {
		this(id, tipo);
		this.soldados = soldados;
		this.colorAtacante = colorEjercitoAtacante;
	}

	public int getId() {
		return id;
	}

	public int getStaminaBatallon() {
		int staminaTotal = 0;
		for (Soldado soldado : soldados) {
			staminaTotal += soldado.getStamina();
		}
		return staminaTotal;
	}

	public int getExperienciaBatallon() {
		int experienciaTotal = 0;
		for (Soldado soldado : soldados) {
			experienciaTotal += soldado.getExperiencia();
		}
		return experienciaTotal;
	}

	public Color getColorAtacante() {
		return colorAtacante;
	}

	public int getAtaqueBatallon() {
		int ataqueTotal = 0;
		for (Soldado soldado : soldados) {
			ataqueTotal += soldado.getAtaque();
		}
		return ataqueTotal;
	}

	public int getDefensaBatallon() {
		int defensaTotal = 0;
		for (Soldado soldado : soldados) {
			defensaTotal += soldado.getDefensa();
		}
		return defensaTotal;
	}

	public int getMaximoSoldados() {
		return maximoSoldados;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Integer getCantidadSoldados() {
		return soldados.size();
	}

	public boolean alistarSoldado(Soldado soldado) {
		assert soldado.getEspecialidad().getTipo().equals(tipo) : "epecialidad no compatible";
		return soldados.add(soldado);

	}

}
