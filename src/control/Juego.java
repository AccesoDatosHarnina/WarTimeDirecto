package control;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import modelo.Batallon;
import modelo.Ejercito;
import modelo.Especialidad;
import modelo.Medidas;
import modelo.Soldado;
import modelo.Tablero;
import modelo.Tipo;

public class Juego {

	private LinkedList<Batallon> group = new LinkedList<Batallon>();
	private LinkedList<Batallon> group1 = new LinkedList<Batallon>();
//	private Ejercito ejercitoA = new Ejercito(0, group);
//	private Ejercito ejercitoB = new Ejercito(1, group1);
	private Tablero tablero;
	private Stack<Batallon> batallonesColocacion = new Stack<Batallon>();
	private final Medidas medidasTablero = new Medidas(6, 12);

	public Juego() {
		super();
		rellenarBatallonGroup();
		rellenarBatallonGroup1();
		llenarBatallonesAcolocar();
		this.tablero = new Tablero(this.medidasTablero);
	}

	public Stack<Batallon> getBatallonesColocacion() {
		return batallonesColocacion;
	}

	private void llenarBatallonesAcolocar() {
		for (Batallon batallon : group) {
			batallonesColocacion.push(batallon);
		}
		for (Batallon batallon2 : group1) {
			batallonesColocacion.push(batallon2);
		}

	}

	public Tablero getTablero() {
		return tablero;
	}

	private void rellenarBatallonGroup1() {
		Color color = Color.blue;
		LinkedList<Soldado> soldadosArc = new LinkedList<Soldado>();
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		Batallon unoA = new Batallon(0, Tipo.arqueria, soldadosArc, color);
		this.group.add(unoA);
		LinkedList<Soldado> soldadosCab = new LinkedList<Soldado>();
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));

		Batallon dosA = new Batallon(0, Tipo.caballeria, soldadosArc, color);
		this.group.add(dosA);
		LinkedList<Soldado> soldadosInf = new LinkedList<Soldado>();
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		Batallon tresA = new Batallon(0, Tipo.infanteria, soldadosArc, color);
		this.group.add(tresA);
		LinkedList<Soldado> soldadosArc2 = new LinkedList<Soldado>();
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		Batallon cuatroA = new Batallon(0, Tipo.arqueria, soldadosArc, color);
		this.group.add(cuatroA);
		LinkedList<Soldado> soldadosInf2 = new LinkedList<Soldado>();
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		Batallon cincoA = new Batallon(0, Tipo.infanteria, soldadosArc, color);
		this.group.add(cuatroA);
	}

	private void rellenarBatallonGroup() {
		Color color = Color.red;
		LinkedList<Soldado> soldadosArc = new LinkedList<Soldado>();
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		soldadosArc.add(new Soldado(Especialidad.arco));
		soldadosArc.add(new Soldado(Especialidad.ballesta));
		Batallon unoB = new Batallon(0, Tipo.arqueria, soldadosArc, color);
		this.group.add(unoB);
		LinkedList<Soldado> soldadosCab = new LinkedList<Soldado>();
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));
		soldadosCab.add(new Soldado(Especialidad.pesada));
		soldadosCab.add(new Soldado(Especialidad.ligera));

		Batallon dosB = new Batallon(0, Tipo.caballeria, soldadosArc, color);
		this.group.add(dosB);
		LinkedList<Soldado> soldadosInf = new LinkedList<Soldado>();
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		soldadosInf.add(new Soldado(Especialidad.espada));
		soldadosInf.add(new Soldado(Especialidad.lanza));
		Batallon tresB = new Batallon(0, Tipo.infanteria, soldadosArc, color);
		this.group.add(tresB);
		LinkedList<Soldado> soldadosArc2 = new LinkedList<Soldado>();
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		soldadosArc2.add(new Soldado(Especialidad.arco));
		soldadosArc2.add(new Soldado(Especialidad.ballesta));
		Batallon cuatroB = new Batallon(0, Tipo.arqueria, soldadosArc, color);
		this.group.add(cuatroB);
		LinkedList<Soldado> soldadosInf2 = new LinkedList<Soldado>();
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		soldadosInf2.add(new Soldado(Especialidad.arco));
		soldadosInf2.add(new Soldado(Especialidad.ballesta));
		Batallon cincoB = new Batallon(0, Tipo.infanteria, soldadosArc, color);
		this.group.add(cuatroB);
	}

}
