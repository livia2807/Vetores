package Aula_LPA_2lista;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somador = 0, num;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Informe a idade: ");
			num = ler.nextInt();

			somador = somador + num;
		}
		System.out.println("O resultado da soma é igual a: " + somador);

	}

}
