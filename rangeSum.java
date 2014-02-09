/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
		int n1,n2,nA;
			
		System.out.print (args[0]+" "+args[1]+"= ");

		n1 = Integer.parseInt(args[0].toString());
		n2 = Integer.parseInt(args[1].toString());
		
			for(int i=n1;i<n2;i++){
		nA=i+1;

	if(nA!=n2){


		System.out.print(nA+" ");

			 }
      }
   }

}