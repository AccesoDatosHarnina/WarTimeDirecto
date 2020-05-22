package modelo;

import java.util.Arrays;

public enum Especialidad {

	espada(Tipo.infanteria, 1.2f, 1.1f), lanza(Tipo.infanteria, 1.3f, 1), arco(Tipo.arqueria, .8f, 1.2f),
	ballesta(Tipo.arqueria, .8f, 1.4f), ligera(Tipo.caballeria, 1, 1.4f), pesada(Tipo.caballeria, 1.6f, 1.5f);

	private Tipo tipo;
	private float defensa, ataque;

	private Especialidad(Tipo tipo, float defensa, float ataque) {
		this.tipo = tipo;
		this.defensa = defensa;
		this.ataque = ataque;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public static Especialidad getTipoPorNombre(String especialidad) {

		for (Especialidad especial : Arrays.asList(Especialidad.values())) {
			if (especial.toString().equals(especialidad)) {
				return especial;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public float getDefensa(int defensa) {
		return defensa * this.defensa;
	}

	public float getAtaque(int ataque) {
		return this.ataque * ataque;
	}
}
