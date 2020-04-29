package control;

import java.util.LinkedList;
import java.util.List;

import modelo.Coordenada;
import modelo.Ejercito;
import modelo.Soldado;
import vista.info.EspecificacionSoldadosInfo;

public class Controller {

	private Juego juego;

	public Controller(Juego juego) {
		super();
		this.juego = juego;
	}

	public Juego getJuego() {
		return juego;
	}

	public boolean localizar(Coordenada coordenada) {
		return juego.localizarBatallones(coordenada);
	}

	public void poblarBatallon(List<EspecificacionSoldadosInfo> especificacion) {
		assert especificacion != null;
		Ejercito ejercito = juegoEjercitos().get(juego.getIdEjercitoActual());
		for (EspecificacionSoldadosInfo especificacionSoldadosInfo : especificacion) {
			for (int i = 0; i < especificacionSoldadosInfo.getCantidad(); i++) {
				ejercito.getBatallonActual().alistarSoldado(new Soldado(especificacionSoldadosInfo.getEspecialidad()));
			}
		}

	}

	private LinkedList<Ejercito> juegoEjercitos() {
		return juego.getEjercitos();
	}
}
