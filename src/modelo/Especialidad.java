package modelo;

import java.util.Arrays;

public enum Especialidad {
	
	Espada(Tipo.infanteria),Lanza(Tipo.infanteria),Arco(Tipo.arqueria),Ballesta(Tipo.arqueria),
	Ligera(Tipo.caballeria),Pesada(Tipo.caballeria);
	private Tipo tipo;

	private Especialidad(Tipo tipo) {
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public static Especialidad getTipoPorNombre(String especialidad) {
		
		for (Especialidad especial : Arrays.asList(Especialidad.values())) {
			if(especial.toString().equals(especialidad)) {
				return especial;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "bien";
	}
}
