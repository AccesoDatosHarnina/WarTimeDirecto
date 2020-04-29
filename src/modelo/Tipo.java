package modelo;

public enum Tipo {
	infanteria("/Imagenes/infanteria.png"), caballeria("/Imagenes/cabaleria.png"), arqueria("/Imagenes/arqueria.png");

	private String img;

	private Tipo(String IMG) {
		this.img = IMG;
	}

	public String getImg() {
		return img;
	}

	
}
