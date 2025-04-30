package Aula_vetor;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		int soma = 0;
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o valor " + i + "º: ");
			vetor[i] = ler.nextInt();

			soma = soma + vetor[i];
		}
		if (soma >= 15) {
			System.out.println("O resultado da soma desses números é igual a: " + soma);
		} else {
			System.out.println("O resultado da soma é menor que 15!");

		}

	}
}
