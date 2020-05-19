package control;

import modelo.Batallon;
import modelo.Coordenada;
import modelo.Ejercito;
import modelo.Error;

public class Colocador implements Ponedor {

	@Override
	public boolean poner(Juego juego,Coordenada coordenada) {
		boolean insertar = juego.comprobarLocalizacion(coordenada);
		if (!insertar) {
			juego.setErrorActual(Error.posicion);
		} else if (juego.isLocalizarEstado()) {
			Ejercito ejercito = juego.getEjercitoActual();
			Batallon batallonActual = ejercito.getBatallonActual();
			insertar = juego.insertar(batallonActual, coordenada);
			if (insertar) {
				if (!ejercito.setSiguienteBatallon()) {
					juego.setSiguienteEjercito();
				}
			} else {
				juego.setErrorActual(Error.ocupada);
			}
		}
		return insertar && juego.isLocalizarEstado();
	}

}
