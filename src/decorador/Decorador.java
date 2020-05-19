package decorador;

public abstract class Decorador extends Componente{
    private Componente componente;
 
    public Decorador(Componente componente){
        this.componente = componente;
    }
 
    public void operacion(){
        componente.operacion();
    }
    
    public Componente degradar() {
    	return this.componente;
    }
 }