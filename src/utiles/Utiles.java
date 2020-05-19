package utiles;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Coordenada;

public class Utiles {
	// Todos los metodos aqui definidos (o casi todos) se pasan a clases para dejar
	// de ser estaticos
	// TODO un test si sabes lo que te conviene

	public static String nombrar(int i, int j) {
		return String.valueOf(i) + ":" + String.valueOf(j);
	}

	public static Coordenada getCoordenada(String coordenada) {
		String[] split = coordenada.split(":");
		return new Coordenada(Integer.valueOf(split[0]), Integer.valueOf(split[1]));
	}

	public static int getAleatorioSesgado(int min, int max, int porcentajeSesgo) {
		assert max > min && min >= 0;
		assert porcentajeSesgo >= 0 && porcentajeSesgo <= 100;
		assert porcentajeSesgo % 10 == 0;
		int experimentos=10;
		ArrayList<Integer> lista=new ArrayList<Integer>();
		for (int i = 0; i <experimentos; i++) {
			lista.add((int) ((Math.random() * ((max + 1) - min)) + min));
		}
		Collections.sort(lista);
		Collections.reverse(lista);
		min=0;
		max=experimentos-(porcentajeSesgo/experimentos);
		Integer integer = lista.get((int) ((Math.random() * ((max + 1) - min)) + min));
		return integer;
	}
}
