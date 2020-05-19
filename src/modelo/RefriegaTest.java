package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RefriegaTest {

	@Test
	void testLucha() {
		Soldado defensor=new Soldado(Especialidad.arco);
		Soldado atacante=new Soldado(Especialidad.pesada);
		Refriega refriega=new Refriega(defensor, atacante);
		refriega.lucha();
		
	}

}
