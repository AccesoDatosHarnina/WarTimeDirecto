package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Medidas;
import modelo.Tablero;
import vista.info.TableroUIInfo;

public class UI extends JFrame {

	private JPanel contentPane;
	private TableroUI tableroUI;
	private BordeArmada panelPoblador;
	protected MercadoSoldadoDialog mercadoSoldado;
	private Tablero tablero = new Tablero(new Medidas(6, 12));
	private TableroUIInfo tableroUIInfo = new TableroUIInfo(tablero);

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(new BorderLayout(0, 0));
		tableroUI = new TableroUI(6, 12);
		contentPane.add(tableroUI);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		panelPoblador = new BordeArmada();
		contentPane.add(panelPoblador, BorderLayout.WEST);

	}

	public BordeArmada getPanelPoblador() {
		return panelPoblador;
	}

	public TableroUI getTableroUI() {
		return tableroUI;
	}

	public JButton getBtnPoblar() {
		return panelPoblador.getBtnPoblar();
	}

	public JButton getBtnLocate() {
		return panelPoblador.getBtnLocate();
	}
}
