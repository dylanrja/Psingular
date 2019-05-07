package modelo;

import java.util.Scanner;

public class Romanos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		String cadena="";
		System.out.println("ingrese un numero entre 1 y 1000"); 
	    numero = sc.nextInt(); 
	    cadena=convertir(numero,cadena);
	    System.out.println("en romano es: "+cadena);
}
public static String convertir(int num, String cadena) {
		if(num==0) {
			return cadena;
		}
		else if (num>1000) {
			cadena="El numero debe ser menor a 1000.";
			num=0;
			return convertir(num,cadena);
		}
		else if (num==1000) {
			cadena+="M";
			num=num-1000;
			return convertir(num,cadena);
		}
		else if (num>=900) {
			cadena+="CM";
			num=num-900;
			return convertir(num,cadena);
		}
		else if (num>=500) {
			cadena+="D";
			num=num-500;
			return convertir(num,cadena);
		}
		else if (num>=400) {
			cadena+="CD";
			num=num-400;
			return convertir(num,cadena);
		}
		else if (num>=100) {
			cadena+="C";
			num=num-100;
			return convertir(num,cadena);
		}
		else if (num>=90) {
			cadena+="XC";
			num=num-90;
			return convertir(num,cadena);
		}
		else if (num>=50) {
			cadena+="L";
			num=num-50;
			return convertir(num,cadena);
		}
		else if (num>=40) {
			cadena+="XL";
			num=num-40;
			return convertir(num,cadena);
		}
		else if (num>=10) {
			cadena+="X";
			num=num-10;
			return convertir(num,cadena);
		}
		else if (num==9) {
			cadena+="IX";
			num=num-9;
			return convertir(num,cadena);
		}
		else if (num>=5) {
			cadena+="V";
			num=num-5;
			return convertir(num,cadena);
		}
		else if (num==4) {
			cadena+="IV";
			num=num-4;
			return convertir(num,cadena);
		}
		else if (num>=1) {
			cadena+="I";
			num=num-1;
			return convertir(num,cadena);
		}
		return cadena;
		
		}
}
