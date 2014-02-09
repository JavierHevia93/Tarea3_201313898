/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
      	System.out.println(args[0]);
		int num1;
		num1=Integer.parseInt(args[0].toString());
	if (num1%3==0){
   		// si el numero es impar
   			System.out.println("numero es impar");}

	else if (num1%2==0)
		{
   		// si el numero es par
   			System.out.println("numero es par");}

   }
}