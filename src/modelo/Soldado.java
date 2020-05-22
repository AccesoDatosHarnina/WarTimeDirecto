package modelo;

import utiles.Utiles;

public class Soldado {
	
	private Especialidad especialidad;
	private final int staminaMaxima=100; 
	private int stamina=staminaMaxima;
	private final int staminaCritica=20;
	private int experiencia=1;
	private int defensa=1;
	private int ataque=1;
	private int min=1,max=6;
	
	public Soldado(Especialidad especialidad) {
		super();
		this.especialidad = especialidad;
	}

	public int getStamina() {
		return stamina;
	}

	public void infringir(float valor) {
		stamina-=valor;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public float atacar() {
		int sinSesgo=0;
		int aleatorioSesgado = Utiles.getAleatorioSesgado(min, max, sinSesgo);
		float ataque2 = especialidad.getAtaque(ataque);
		return aleatorioSesgado+experiencia+ataque2;
	}
	
	public float defender() {
		int sesgo=10;
		int aleatorioSesgado = Utiles.getAleatorioSesgado(min, max, sesgo);
		float defensa2 = especialidad.getDefensa(defensa);
		return aleatorioSesgado+experiencia+defensa2;
	}

	public void incrementarExperiencia(int valor) {
		experiencia=addValor(experiencia,valor);
	}

	private int addValor(int inicial, int valor) {
		return inicial+=valor;
	}

	public void incrementarDefensa(int valor) {
		defensa+=valor;
	}

	public void incrementaAtaque(int valor) {
		ataque+=valor;
	}
	
	public boolean isCriticaStamina() {
		return stamina<=staminaCritica;
	}

	public boolean isSeveramenteHerido(int staminaInicialAtacante) {
		return stamina<staminaInicialAtacante/2;
	}

}
