package pruebasui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JPanel;

import control.Controller;
import control.Juego;
import modelo.Coordenada;
import modelo.Ejercito;
import utiles.Utiles;
import vista.BordeArmada;
import vista.MercadoSoldadoDialog;
import vista.Conversores.Generador;
import vista.info.EjercitoInfo;

public class paraUIPruebaTablero extends TableroUIPrueba {

	private Controller control;
	private EjercitoInfo ejercitoActualInfo;
	private boolean puedesColocar = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paraUIPruebaTablero frame = new paraUIPruebaTablero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	MouseAdapter mouseAdapter = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			JPanel panel = (JPanel) e.getSource();
			if (puedesColocar) {

				Coordenada coordenada = Utiles.getNombre(panel.getName());
				if (!control.localizar(coordenada)) {
					System.out.println("Algo va mal");
				} else {

					getPanelPoblador()
							.update(Generador.getEjercitoInfo(getEjercitos().get(getJuego().getIdEjercitoActual())));
					getTableroUI().actualizarTablero(Generador.getTableroUIInfo(getJuego()));

					getBtnLocate().setEnabled(false);
					getBtnPoblar().setEnabled(true);
					puedesColocar = false;
				}

			}

		}

	};

	public paraUIPruebaTablero() {
		super();
		Juego juego = new Juego();
		getTableroUI().setMouseAdapter(mouseAdapter);
		control = new Controller(juego);
		getTableroUI().actualizarTablero(Generador.getTableroUIInfo(juego));
		getPanelPoblador()
				.cargarEjercito(Generador.getEjercitoInfo(juego.getEjercitos().get(juego.getIdEjercitoActual())));
		getBtnPoblar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mercadoSoldado = new MercadoSoldadoDialog(Generador.getMercadoSoldadoInfo(
						juego.getEjercitos().get(juego.getIdEjercitoActual()).getBatallonActual()));
				mercadoSoldado.setVisible(true);
				mercadoSoldado.getBtnOk().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (mercadoSoldado.compruebaMax()) {

							control.poblarBatallon(mercadoSoldado.getListaEjercito());

							getBtnLocate().setEnabled(true);
							getBtnPoblar().setEnabled(false);
							mercadoSoldado.dispose();
						}

					}

				});
			}
		});
		getBtnLocate().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				puedesColocar = true;

			}
		});
	}

	private LinkedList<Ejercito> getEjercitos() {
		return getJuego().getEjercitos();
	}

	private Juego getJuego() {
		return control.getJuego();
	}

}
