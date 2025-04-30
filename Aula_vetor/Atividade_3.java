package Aula_vetor;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		int vetorC[] = new int[10];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o " + i + " valor: ");
			vetorA[i] = ler.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe os outros valores também:");
			vetorB[i] = ler.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			vetorC[i] = vetorA[i];
			vetorC[i + 5] = vetorB[i];
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Os primeiros valores do vetorA são:" + vetorA[i]);
			System.out.println("Os valores do vetorB são:" + vetorB[i]);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Os valores do vetorC são:" + vetorC[i]);
		}
	}

}
