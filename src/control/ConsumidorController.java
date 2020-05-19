package control;

public class ConsumidorController {

	private Juego juego;
	
	
	public ConsumidorController(Juego juego) {
		super();
		this.juego = juego;
	}

	public void mover() {
		System.out.println(" soy el mover de consumidorController");
	}
	public void presentaJuego() {
		System.out.println(juego);
	}
	public void confrontar() {
		
	}
}
