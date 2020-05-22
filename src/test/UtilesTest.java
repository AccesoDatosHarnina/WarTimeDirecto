package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utiles.Utiles;

class UtilesTest {

	private final static int sesgo = 10;

	@Test
	void testGetAleatorioSesgadoSinSesgo() {
		int min = 1, max = 6;
		boolean tocadoMin = false, tocadoMax = false;
		for (int i = 0; i < 100; i++) {
			int aleatorioSesgado = Utiles.getAleatorioSesgado(min, max, 0);
			assertTrue(aleatorioSesgado >= 1 && aleatorioSesgado <= 6);
			if (aleatorioSesgado == min)
				tocadoMin = true;
			if (aleatorioSesgado == max)
				tocadoMax = true;
		}
		assertTrue(tocadoMin);
		assertTrue(tocadoMax);
	}

	@Test
	void testGetAleatorioSesgado() {
		int pruebas = 10;
		int delta = 1;
		// ejemplo de delta resultado es 10% +-5%
		for (int j = 0; j < pruebas; j++) {
			assertEquals(sesgo, getEscaneo(), delta);
		}
	}

	private int getEscaneo() {
		int experimentos = 100000;
		int min = 1, max = 6;
		int resultadoA = 0, resultadoB = 0;
		int victoriasA = 0, victoriasB = 0;
		for (int i = 0; i < experimentos; i++) {
			resultadoA = Utiles.getAleatorioSesgado(min, max, sesgo);
			resultadoB = Utiles.getAleatorioSesgado(min, max, 0);
			if (resultadoA > resultadoB) {
				victoriasA++;
			} else if (resultadoB > resultadoA) {
				victoriasB++;
			}
		}
		int porcentajeA = (victoriasA * 100) / experimentos;
		int porcentajeB = (victoriasB * 100) / experimentos;
		return porcentajeA - porcentajeB;
	}

}
