package ensayos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.Conversores.Generador;
import vista.info.MercadoSoldadosInfo;

public class MercadoSoldadosEnsayo extends JPanel {
	private JLabel lblBatallonId;
	private JLabel lblMaxSoldados;
	private ArrayList<EspecialidadSoldadosEnsayo> especialidades;
	private JLabel lblTipoSoldado;
	private JLabel lblTotal;

	FocusAdapter mioAdapter=new FocusAdapter() {
		public void focusLost(java.awt.event.FocusEvent e) {
			lblTotal.setText(String.valueOf(sumaSoldados()));
		};
	};
	/**
	 * Create the panel.
	 */
	public MercadoSoldadosEnsayo(MercadoSoldadosInfo info) {
		setLayout(null);
		especialidades = Generador.getEspecialidadesEnsayo(info.getTipoBatallon(),mioAdapter);

		JLabel lblBatallonNumero = new JLabel("Batallon numero ");
		int height2 = 16;
		lblBatallonNumero.setBounds(62, 51, 165, height2);
		add(lblBatallonNumero);

		lblBatallonId = new JLabel(String.valueOf(info.getBatallonID()));
		lblBatallonId.setBounds(256, 51, 56, height2);
		add(lblBatallonId);

		JLabel lblMax = new JLabel("max.");
		lblMax.setBounds(395, 51, 56, height2);
		add(lblMax);

		lblMaxSoldados = new JLabel(String.valueOf(info.getMaxSoldados()));
		lblMaxSoldados.setBounds(482, 51, 56, height2);
		add(lblMaxSoldados);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(62, 135, 56, height2);
		add(lblTipo);

		lblTipoSoldado = new JLabel(String.valueOf(info.getTipoBatallon()));
		lblTipoSoldado.setBounds(171, 135, 56, height2);
		add(lblTipoSoldado);
		int y = 223;
		for (EspecialidadSoldadosEnsayo especialidadSoldadosEnsayo : especialidades) {
			especialidadSoldadosEnsayo.setBounds(75, y, 556, height2);
			add(especialidadSoldadosEnsayo);
			y += height2 + 5;
		}
		JLabel lblTotalf = new JLabel("Total");
		lblTotalf.setBounds(62, 390, 56, height2);
		add(lblTotalf);

		lblTotal = new JLabel(String.valueOf(sumaSoldados()));
		lblTotal.setBounds(245, 390, 56, height2);
		add(lblTotal);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnOk.setBounds(497, 416, 97, 25);
		add(btnOk);

	}

	private int sumaSoldados() {
		int total = 0;
		for (EspecialidadSoldadosEnsayo especialidadSoldadosEnsayo : especialidades) {
			String text = especialidadSoldadosEnsayo.getTxtCantidad().getText();
			int cantidad = Integer.valueOf(text);
			total += cantidad;
		}
		return total;
	}

	public JLabel getLblBatallonId() {
		return lblBatallonId;
	}

	public JLabel getLblMaxSoldados() {
		return lblMaxSoldados;
	}

	public JLabel getLblTipoSoldado() {
		return lblTipoSoldado;
	}
}
