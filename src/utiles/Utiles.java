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

	private static Integer obtenerAleatorio(int min, int max) {
		assert max>=min;
		return  (int) ((Math.random()*((max+1)-min))+min);
	}
	
	private static Integer obtenerValor(ArrayList<Integer> lista, int validos) {
		Collections.sort(lista);
		Collections.reverse(lista);
		return lista.get(obtenerAleatorio(0, validos - 1));

	}
	
	public static int getAleatorioSesgado(int min, int max, int porcentajeSesgo) {
		assert porcentajeSesgo >= 0 && porcentajeSesgo <= 90;
		assert porcentajeSesgo % 10 == 0;
		int experimentos = 10;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int validos = experimentos - (porcentajeSesgo / experimentos);
		int factorCorrecion=1;
		validos-=factorCorrecion;
		for (int i = 0; i < experimentos; i++) {
			lista.add(obtenerAleatorio(min, max));
		}
		return obtenerValor(lista, validos);
	}
}
