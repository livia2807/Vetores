package Aula_LPA_2lista;

import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int media = 0, num;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Informe sua idade: ");
			num = ler.nextInt();

			media = (media + num)/ 20;
		}
		System.out.println("A média de idade é igual a: " + media);

	}

}
