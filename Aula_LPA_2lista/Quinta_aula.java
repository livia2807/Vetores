package Aula_LPA_2lista;

import java.util.Scanner;

public class Quinta_aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {
			System.out.print("Informe seu nome: ");
			String nome = ler.next();

			System.out.print("Informe sua idade: ");
			int idade = ler.nextInt();

			if (idade >= 18) {
				System.out.println(" ➡️ Seu nome é: " + nome + " e sua idade é: " + idade);
				
			}
		}
		ler.close();
		

	}
}
