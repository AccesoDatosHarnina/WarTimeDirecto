package modelo;

public class Refriega {
	private Soldado defensor, atacante;
	private int incrementoExperiencia = 1, incrementoDefensa = 1, incrementoAtaque = 1;
	private int staminaInicialDefensor, staminaInicialAtacante;

	public Refriega(Soldado defensor, Soldado atacante) {
		super();
		this.defensor = defensor;
		this.atacante = atacante;
		staminaInicialAtacante = atacante.getStamina();
		staminaInicialDefensor = defensor.getStamina();
	}

	public void lucha() {
		float defensa = 0, ataque = 0;
		while (!isAlguienSeveramenteHerido()) {
			// Como hay varios confrontamientos en una refriega
			// el sesgo se va acumulando
			defensa = defensor.defender();
			ataque = atacante.atacar();
			defensor.infringir(ataque);
			atacante.infringir(defensa);
		}
		finalizar();
	}

	private void finalizar() {
		defensor.incrementarExperiencia(incrementoExperiencia);
		atacante.incrementarExperiencia(incrementoExperiencia);
		defensor.incrementarDefensa(incrementoDefensa);
		if (isVencedorAtacante())
			atacante.incrementaAtaque(incrementoAtaque);
	}

	private boolean isAlguienSeveramenteHerido() {
		// Cuando tiene la mitad de la stamina que al comienzo de la refriega
		return defensor.isSeveramenteHerido(staminaInicialDefensor)
				|| atacante.isSeveramenteHerido(staminaInicialAtacante);
	}

	public boolean isVencedorAtacante() {
//		return !atacante.isSeveramenteHerido(staminaInicialAtacante);
		return atacante.getStamina()>defensor.getStamina();
	}

	public Soldado getDefensor() {
		return defensor;
	}

	public Soldado getAtacante() {
		return atacante;
	}

}
