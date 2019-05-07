package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa el tamaño del lado: ");
		int lado=sc.nextInt();
		Cubo cubo=new Cubo(lado);
		do {
			System.out.println("Selecciona una opción:\n"
					+ "1.-Mostrar tamaño del lado\n"
					+ "2.-Mostrar perimetro de cuadrado\n"
					+ "3.-Mostrar área\n"
					+ "4.-Mostrar volumen\n"
					+ "5.-Mostrar perimetro de cubo\n"
					+ "6.-Cancelar\n"
					+ "7.-Salir");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("El tamaño del lado es: "+cubo.getLado());
				break;
			case 2:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El perimetro de cuadrado es: "+cubo.calcularPerimetro());
				break;
			case 3:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El area es: "+cubo.calcularArea());
				break;
			case 4:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El volumen es: "+cubo.calcularVolumen());
				break;
			case 5:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El perimetro de cubo es: "+cubo.calcularPerimetroc());
				break;
			case 6:
				System.out.println("Ingresa el  nuevo tamaño del lado: ");
				lado=sc.nextInt();
				cubo=new Cubo(lado);
				break;
			case 7:
				System.out.println("adios");
				break;

			default:
				break;
			}
			
		} while (opcion!=7);
		sc.close();
	}
}
