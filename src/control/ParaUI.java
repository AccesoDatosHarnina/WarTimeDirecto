package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import modelo.Coordenada;
import utiles.Utiles;
import vista.Advertencia;
import vista.MercadoSoldadoDialog;
import vista.UserInterface;
import vista.Conversores.Generador;
import vista.info.TableroUIInfo;

public class ParaUI extends UserInterface {
//	private controller controller;
	private ConsumidorController consumidorController;
	private ComenzarController comenzarController;
	private Controller controller;
	private int ancho = 12, alto = 6;

	MouseAdapter mouseAdapter = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			JPanel panel = (JPanel) e.getSource();
			panel.setBackground(Color.YELLOW);
			Coordenada coordenada = Utiles.getCoordenada(panel.getName());
			if (!controller.poner(coordenada)) {
				new Advertencia(controller.getError());
			} else {
				getBordeArmada().getBtnPoblar().setEnabled(true);
				getBordeArmada().update(Generador.getEjercitoInfo(controller.getEjercitoActual()));
				getBordeArmada().setVisible(controller.isLocalizarEstado());
				getTableroUI().actualizarTablero(getTableroUIInfo(controller.getJuego()));
			}
		}
	};

	public ParaUI() {
		super();
		// Para probar el decorador
		controller = new Controller(ancho, alto);
		controller.presentaJuego();
		comenzarController = new ComenzarController(ancho, alto, controller.getJuego());
		comenzarController.presentaJuego();
		consumidorController = new ConsumidorController(controller.getJuego());
		consumidorController.presentaJuego();
		controller.cambiarJuego();
		controller.presentaJuego();
		comenzarController.presentaJuego();
		// Despues de pensarlo no nos interesa el patron Decorator
		// porque nosotros no añadimos funcionalidades al juego
		// lo que hacemos es cambiar el comportamiento de una metodo del juego

		getTableroUI().setMouseAdapter(mouseAdapter);
		getTableroUI().actualizarTablero(getTableroUIInfo(controller.getJuego()));
		getBordeArmada().cargarEjercito(Generador.getEjercitoInfo(controller.getEjercitoActual()));
		getBtnPoblar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MercadoSoldadoDialog mercadoSoldado = new MercadoSoldadoDialog(
						Generador.getMercadoSoldadoInfo(controller.getBatallonActual()));
				mercadoSoldado.setVisible(true);
				mercadoSoldado.getBtnOk().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (mercadoSoldado.compruebaMax()) {
							controller.poblarBatallon(mercadoSoldado.getListaEspecificacion());
							getBordeArmada().getBtnPoblar().setEnabled(false);
						}
						mercadoSoldado.dispose();
					}
				});
			}
		});
	}

	public TableroUIInfo getTableroUIInfo(Juego juego) {
		return new TableroUIInfo(juego);
	}
}
