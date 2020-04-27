package pruebasui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Juego;
import modelo.Batallon;
import modelo.Coordenada;
import modelo.Medidas;
import modelo.Tablero;
import modelo.Tipo;
import vista.TableroUI;
import vista.info.TableroUIInfo;

public class TableroUIPrueba extends JFrame {

	private JPanel contentPane;
	private TableroUI tableroUI;
	private TableroUIInfo tableroUIInfo;
	private ArrayList<Batallon> batallones = new ArrayList<Batallon>();

	private pruebaRellenarEjercitos pruebaBatallones = new pruebaRellenarEjercitos();

	private Juego prueba = new Juego(pruebaBatallones.getGroup(), pruebaBatallones.getGroup1());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroUIPrueba frame = new TableroUIPrueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableroUIPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		batallones.add(new Batallon(0, Tipo.arqueria));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		MouseAdapter mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JPanel panel = (JPanel) e.getSource();
				if (!getListaDeBatallones().isEmpty()) {

					Coordenada coordenada = obtenerCoordenada(panel.getName());
					getTablero().insertar(getListaDeBatallones().pop(), coordenada);

				}
				tableroUI.actualizarTablero(tableroUIInfo);
			}

			private Stack<Batallon> getListaDeBatallones() {
				return prueba.getBatallonesColocacion();
			}

			private Coordenada obtenerCoordenada(String name) {
				int pos = name.indexOf(":");
				return new Coordenada(Integer.valueOf(name.substring(0, pos)),
						Integer.valueOf(name.substring(pos + 1, name.length())));
			}

		};

		tableroUIInfo = new TableroUIInfo(getTablero());
		tableroUI = new TableroUI(6, 12, mouseAdapter, tableroUIInfo);
		contentPane.add(tableroUI, BorderLayout.CENTER);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	private Tablero getTablero() {
		return prueba.getTablero();

	}
}
