package decorador;


public class DecoradorConcretoA extends Decorador{
   private String propiedadAñadida;

   public DecoradorConcretoA(Componente componente){
       super(componente);
   }

   public void operacion(){
       super.operacion();
       this.propiedadAñadida = "Nueva propiedad";
       System.out.println("DecoradorConcretoA.operacion() "+propiedadAñadida);
   }
}