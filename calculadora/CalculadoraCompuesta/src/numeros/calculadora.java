package numeros;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		double monto = 0, interes = 0, compuesto = 0, total = 0;
		int años = 0;

		System.out.println("Ingrese el monto a invertir");
		monto = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el Porcentaje estimado que va a ganar");
		interes = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el años de reInversion");
		años = Integer.parseInt(input.nextLine());
		
	
		total = monto + (interes / 100) * monto;
		
		int a = 1;
		for (int i = 0; i < años; i++) {
			
        gananciaAnual(interes,monto);
       
			System.out.println("total " + a + "año= "  + total);
			
			compuesto = total + (interes / 100) * total;
			System.out.println("__________________________________________");
			  total=compuesto;
           a++;
		}

	
	}
	public  static double gananciaAnual(double interes, double monto) {
		return (interes / 100) * monto;
	};
}
