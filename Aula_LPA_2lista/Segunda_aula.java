package Aula_LPA_2lista;

import java.util.Scanner;

public class Segunda_aula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double b, h, area;

		System.out.println("Informe o valor da base do triângulo: ");
		b = ler.nextDouble();
		System.out.println("Informe o valor da altura do triângulo: ");
		h = ler.nextDouble();

		area = (b * h) / 2;

		System.out.println("A área desse triângulo é igual a: " + area);
		ler.close();

	}

}
