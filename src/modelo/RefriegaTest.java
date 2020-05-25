package modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class RefriegaTest {

	@Ignore
	void testLucha() {

		// caso 2 ante un soldado que se defiende mejor de lo que ataca su contrincante
		// el defensor debe ganar mas veces en una cantidad segun ?
		// caso 3 ante un soldado que ataca mejor de lo que defiende su contrincante
		// el atacante debe ganar en una cantidad de veces segun ?

	}

	@Test
	void testLuchaCasoUno() {
		// caso 1 ante los mismos porcentajes de lucha (ataque/defensa en especialidad)
		// gana el defensor segun el sesgo del 10%
		int experimentos = 100;
		int pruebas=100;
		int ataqueVencedor =0;
		int delta=2;
		for (int i = 0; i < pruebas; i++) {
			ataqueVencedor+=luchas(experimentos);
		}
		ataqueVencedor/=pruebas;
		int sesgo=10;
		assertEquals(experimentos/2-experimentos/sesgo,ataqueVencedor,delta);
	}

	private int luchas(int experimentos) {
		Soldado defensor;
		Soldado atacante;
		Refriega refriega;
		int ataqueVencedor = 0;
		for (int i = 0; i < experimentos; i++) {
			defensor = new Soldado(Especialidad.ligera);
			atacante = new Soldado(Especialidad.lanza);
			refriega = new Refriega(defensor, atacante);
			refriega.lucha();
			if (refriega.isVencedorAtacante()) {
				ataqueVencedor++;
			}
		}
		return ataqueVencedor*100/experimentos;
	}

}
