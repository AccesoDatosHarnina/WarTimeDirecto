package vista;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utiles.Utiles;
import vista.info.FichaInfo;
import vista.info.TableroUIInfo;

public class TableroUI extends JPanel {

	// Cada una de las casillas representadas en el tablero
	private JPanel[][] fichas;
	private MouseAdapter mouseAdapter;

	/**
	 * Create the panel.
	 */
	public TableroUI(int ancho, int alto) {
		super();
		fichas = new JPanel[ancho][alto];
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new GridLayout(ancho, alto, 0, 0));

	}

	public void setMouseAdapter(MouseAdapter mouseAdapter) {
		this.mouseAdapter = mouseAdapter;
	}

	public void actualizarTablero(TableroUIInfo tableroUIInfo) {
		removeAll();
		FichaInfo[][] fichasInfo = tableroUIInfo.getFichasFichaInfo();
		for (int i = 0; i < fichas.length; i++) {
			for (int j = 0; j < fichas[i].length; j++) {
				fichas[i][j] = getFicha(fichasInfo[i][j]);
				fichas[i][j].setName(Utiles.nombrar(i,j));
				fichas[i][j].addMouseListener(mouseAdapter);
				add(fichas[i][j]);
			}
		}
		revalidate();
	}

	public JPanel getFicha(FichaInfo fichasInfo) {

		if (fichasInfo == null) {
			return new FichaBlanca();
		}
		return new Ficha(fichasInfo);
	}

}
