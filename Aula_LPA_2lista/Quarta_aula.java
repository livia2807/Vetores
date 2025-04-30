package Aula_LPA_2lista;

import java.util.Scanner;

public class Quarta_aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int somador = 0, num;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe um valor: ");
			num = ler.nextInt();

			somador = (somador + num);
		}
		System.out.print("A soma dos elementos é igual a: " + somador);
		ler.close();

	}

}
