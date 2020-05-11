package pruebasui;

import control.Juego;
import vista.info.TableroUIInfo;

public class ParaUIConsumirTurnoPrueba extends UIConsumirTurnoPrueba {
	private ConsumirTurnoControllerPrueba consumirTurnoControllerPrueba;

	public ParaUIConsumirTurnoPrueba() {
		super();
		Juego juego = new Juego(12, 7);
		consumirTurnoControllerPrueba = new ConsumirTurnoControllerPrueba(juego);
		crearTablero(juego);
		getTableroUI().actualizarTablero(getTableroUIInfo(juego));
	}

	public TableroUIInfo getTableroUIInfo(Juego juego) {
		return new TableroUIInfo(juego);
	}

}
