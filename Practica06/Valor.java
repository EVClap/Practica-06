/**
 *Creamos un valor
 *@author: Emilio V. Calderon
 */
public class Valor{
    //Atributos
    public int x;
    
    //Constructor
    /**
     *Construye un valor
     *@param: magnitud del valor; tipo entero
     */
    public Valor(int x){
	this.x = x;
    }

    //Métodos
     /**
     *Devuelve el valor
     */
    public int getValor(){
	return this.x;
    }

     /**
     *Construye una réplica del valor
     */
    public Valor replica(){
	return new Valor(this.x);
    }
    
     /**
     *Cambia el valor
     *@param: magnitud por la que cambiar; tipo entero
     */
    public void cambiarValor(int x){
	this.x = x;
    }

     /**
     *Método main, damos el ejemplo para distingir el paso de parámetros
     */
    public static void main(String[] args){
	Valor x1 = new Valor(2);
	Valor x2 = x1.replica();
	
	System.out.println("Tomamos nuestro valor y le realizamos una copia:");
	System.out.println("x2 = "+ x2.getValor());
	System.out.println("x1 = "+ x1.getValor());
	System.out.println("Despues, cambiamos la magnitud del valor original, y notamos que, la copia no cambia con el:");
	
	x1.cambiarValor(3);
	
	System.out.println("x2 = "+ x2.getValor());
	System.out.println("x1 = "+ x1.getValor());
	
	Valor x3 = new Valor(2);
	Valor x4 = x3;
	
	System.out.println("Ahora tomamos nuestro valor y le creamos un mismo objeto:");
	System.out.println("x4 = "+ x4.getValor());
	System.out.println("x3 = "+ x3.getValor());
	System.out.println("Despues, cambiamos la magnitud del valor original, y notamos que, cambia con el:");
	
	x3.cambiarValor(5);
	
	System.out.println("x4 = "+ x4.getValor());
	System.out.println("x3 = "+ x3.getValor());
    }

}


   
