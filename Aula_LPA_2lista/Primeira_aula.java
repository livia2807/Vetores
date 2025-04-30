package Aula_LPA_2lista;

import java.util.Scanner;

public class Primeira_aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, soma;

		System.out.print("Informe o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = ler.nextInt();

		soma = (num1 + num2);

		System.out.print("O valor da soma é igual a: " + soma);
		ler.close();

	}

}
