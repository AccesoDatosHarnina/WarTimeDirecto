package utiles;

import modelo.Coordenada;

public class Utiles {
	public static String nombrar(int i, int j) {
		return String.valueOf(i) + ":" + String.valueOf(j);
	}

	public static Coordenada getNombre(String coordenada) {
		String[] split = coordenada.split(":");
		return new Coordenada(Integer.valueOf(split[0]), Integer.valueOf(split[1]));
	}
}
