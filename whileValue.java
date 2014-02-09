/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = -1;
		int num1;
   		System.out.println(args[0]);
		num1 = Integer.parseInt(args[0].toString());
		while (num1>valorActual){
			valorActual++;

		//si valor actual < args[0]
   			System.out.println("el valor actual es: "+valorActual);	

		}

   		
      
   }

}