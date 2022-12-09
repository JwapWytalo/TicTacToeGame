package Teste;

import java.util.*;
import Classes.*;

public class App {

	public static void main(String[] args) {

		Metodos met = new Metodos();
		Scanner scan = new Scanner(System.in);
		int linha, coluna, count = 0;

		met.menu();

		System.out.println();

		do {

			if (count % 2 == 0) {

				System.out.println("Vez do jogador 1: ");

				System.out.println("Digite a linha: ");
				linha = scan.nextInt();

				System.out.println("Digite a coluna: ");
				coluna = scan.nextInt();

				met.alterar(linha, coluna, count);

				count++;

			} else {

				System.out.println("vez do jogador 2 ");
				
				System.out.println("Digite a linha: ");
				linha = scan.nextInt();

				System.out.println("Digite a coluna: ");
				coluna = scan.nextInt();

				met.alterar(linha, coluna, count);
				
				count++;
			}

		} while (count != 9);

	}

}
