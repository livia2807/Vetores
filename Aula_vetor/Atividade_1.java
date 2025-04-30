package Aula_vetor;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		String vetor[] = new String[5];//Declarando o vetor
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {                           //
			System.out.println("Informe o nome: " + i + "..:");//Entrada de dados
			vetor[i] = ler.next();                            //
		}
		for (int i = 0; i < 5; i++) {     //Saída
			System.out.println(vetor[i]);//

		}
		ler.close();
	}

}
