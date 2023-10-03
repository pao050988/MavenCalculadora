package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese dos numeros enteros: ");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();

		System.out.println("La suma de los numeros ingresados es: " + suma(num1, num2));
		System.out.println("La resta de los numeros ingresados es: " + resta(num1, num2));
		System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicar(num1, num2));
		System.out.println("La division de los numeros ingresados es: " + division(num1, num2));

	}
	public static int suma(int num1, int num2){

		return num1 + num2;

	}

	public static int resta(int num1, int num2){
		return num1 - num2;

	}

	public static int multiplicar(int num1, int num2){
		return num1 * num2;

	}

	public static double division(int num1, int num2){
		return num1 / num2;

	}
}