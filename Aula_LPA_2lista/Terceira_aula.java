package Aula_LPA_2lista;

import java.util.Scanner;

public class Terceira_aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;

		System.out.print("Informe um dia da semana");
		dia = ler.nextInt();

		if (dia == 1) {
			System.out.print("Domingo");
		} else if (dia == 2) {
			System.out.print("Segunda");
		} else if (dia == 3) {
			System.out.print("Terça");
		} else if (dia == 4) {
			System.out.print("Quarta");
		} else if (dia == 5) {
			System.out.print("Quinta");
		} else if (dia == 6) {
			System.out.print("Sexta");
		} else if (dia == 7) {
			System.out.print("Sábado");
		} else
			System.out.print("Dia inválido!!!");
	}
}
