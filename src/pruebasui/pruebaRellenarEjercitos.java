package pruebasui;

import java.awt.Color;
import java.util.LinkedList;

import modelo.Batallon;
import modelo.Especialidad;
import modelo.Soldado;
import modelo.Tipo;

public class pruebaRellenarEjercitos {
	private LinkedList<Batallon> group = new LinkedList<Batallon>();
	private LinkedList<Batallon> group1 = new LinkedList<Batallon>();

	public pruebaRellenarEjercitos() {
		super();
		rellenarBatallonGroup();
		rellenarBatallonGroup1();
	}
	

	public LinkedList<Batallon> getGroup() {
		return group;
	}


	public LinkedList<Batallon> getGroup1() {
		return group1;
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
