package estructurasdecontrol;
import java.util.Scanner;
public class EjemploSwitch {

	public static void main(String[] args) {
		/*Crear un programa que muestre las opciones
		 * de una calculadora estándar:
		 * Sumar (2 números)
		 * Restar (2 números)
		 * Multiplicar (2 números)
		 * Dividir (2 números - Tomar en cuenta la división entre cero)
		 * Residuo (2 números)
		 * Potencia (de una base a un exponente)
		 * Raiz cuadrada (tomar en cuenta el signo de la raiz)
		 * Inverso multiplicativo (Tomar en cuenta la división entre cero)
		 * Salir de la Aplicación*/
		Scanner lec = new Scanner (System.in);
        double a,b,resultado;
        int entrada;
        
        System.out.println("--Calculadora--");
        System.out.println("Operaciones: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Residuo");
      entrada = lec.nextInt();
       switch(entrada) {
       case 1:
       System.out.println("Escriba num1");
       a=lec.nextDouble();
       System.out.println("Escriba num2");
       b=lec.nextDouble();
       System.out.println("La suma de "+a+" y "+ b+" es "+(a+b));
       break;
       case 2:
    	   System.out.println("Escriba num1");
    	   a=lec.nextDouble();
    	   System.out.println("Escriba num2");
    	   b=lec.nextDouble();
    	   System.out.println("La resta/diferencia de "+a+" menos "+b+" es igual a "+(a-b));
    	   break;
    	   
       case 3:
    	   System.out.println("Escriba num1");
    	   a=lec.nextDouble();
    	   System.out.println("Escriba num2");
    	   b=lec.nextDouble();
    	   System.out.println("El producto de "+a+" y "+b+ " es igual a: "+(a*b));
    	   break;
       case 4:
    	   System.out.println("Escriba num1");
    	   a=lec.nextDouble();
    	   System.out.println("Escriba num2");
    	   b=lec.nextDouble();
    	   if (b==0) {
    	   System.out.println("La division entre 0 no esta definida");
    	   }else {
    		   System.out.println("La division entre "+a+" y "+b+" es igual a "+(a/b));
    		   
    	   }
    	   break;
       case 5:
    	   System.out.println("Escriba num1");
    	   a=lec.nextDouble();
    	   System.out.println("Escriba num2");
    	   b=lec.nextDouble();
    	   System.out.println("El residuo entre "+a+ " y "+b+ " es igual a " +(a%b));
    	   break;
    	   
    	   
    	   
        
	}

}
}
