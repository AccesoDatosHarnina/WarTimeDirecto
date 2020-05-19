package estrategia;

public class Main {	
	public static void main(String args[])
	{
		//Usamos la estrategia A
		Strategy estrategia_inicial = new StrategyA();
		Context context = new Context(estrategia_inicial);
		context.some_method();
		System.out.println("soy el objeto "+context);
		//Decidimos usar la estrategia B
		Strategy estrategia2 = new StrategyB();
		context.setStrategy(estrategia2);
		System.out.println("soy el objeto "+context);
		context.some_method();
		
		//Finalmente,usamos de nuevo la estrategia A
		context.setStrategy(estrategia_inicial);
		System.out.println("soy el objeto "+context);
		context.some_method();
		
		/** Salida:
		 * Estrategia A
		 * Estrategia B
		 * Estrategia A
		 **/
	}
}
