package modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class AtaqueTest {

	@Test
	void test() {
		int experimentos = 100;
		int victorias = 0;
		int delta=0;
		int sesgo=20;
		for (int i = 0; i < experimentos; i++) {
			if(getAtaque()) {
				victorias++;
			}
		}
		assertEquals(experimentos/2-sesgo/2, victorias,delta);
	}
	private boolean getAtaque() {
		//caso cero ataque y defensa al 100%
		Batallon batallonUno = new Batallon(0, Tipo.caballeria, Color.RED);
		Batallon batallonDos = new Batallon(1, Tipo.infanteria, Color.BLUE);
		for (int i = 0; i < 10; i++) {
			batallonUno.alistarSoldado(new Soldado(Especialidad.ligera));
			batallonDos.alistarSoldado(new Soldado(Especialidad.lanza));
		}
		Ataque ataque = new Ataque(batallonUno, batallonDos);
		ataque.combatir();
		return ataque.isAtacanteVencedor();
	}

}
