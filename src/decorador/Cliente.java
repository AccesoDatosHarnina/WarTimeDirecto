package decorador;

public class Cliente {
	public static void main(String[] args) {
		
		ComponenteConcreto c = new ComponenteConcreto();
		c.operacion();
		System.out.println(c);
		System.out.println("------------------------------------");
		DecoradorConcretoA d1 = new DecoradorConcretoA(c);
		d1.operacion();
		System.out.println(d1);
		System.out.println("------------------------------------");
		DecoradorConcretoB d2 = new DecoradorConcretoB(d1);
		d2.operacion();
		System.out.println(d2);
//		System.out.println("------------------------------------");
		//o sea que se añaden más que se sustituyen y ademas sirve para poner nuevas propiedades
		// output: "ComponenteConcreto.operacion()\n DecoradorConcretoA.operacion()\n
						// Comportamiento B añadido\n DecoradorConcretoB.operacion()"
		Componente componente=d2.degradar();
		System.out.println(componente);
		componente.operacion();
	}
}
