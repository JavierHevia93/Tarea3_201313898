/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		
		int n1, n2=1;
	System.out.print(args[0]+"!=");
		n1=Integer.parseInt(args[0].toString());
		for(int i=1; i<=n1;i++)
		{
		n2=i*n2;
			System.out.print(n2+", ");	
			
		
		 
   		/*System.out.println("el producto es: "+resultado);*/
      }
   }

}