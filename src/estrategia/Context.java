package estrategia;

public class Context {
	Strategy c;

	public Context( Strategy c )
	{
		this.c = c;
	}

	public void setStrategy(Strategy c) {
		this.c = c;
	}
	
	//Método de estrategia 'c'
	public void some_method()
	{
		c.behaviour();
	}
}
