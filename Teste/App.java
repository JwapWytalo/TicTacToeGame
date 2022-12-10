package Teste;

import java.util.*;
import Classes.*;

public class App {

	public static void main(String[] args) {

		// VARIAVEIS

		Metodos met = new Metodos();
		Scanner scan = new Scanner(System.in);
		int linha, coluna, count = 0;

		met.tabuleiro();

		System.out.println();

		// LOOP QUE CONTA AS JOGADAS

		do {

			// CONDIÇÃO PARA IDENTIFICAR O JOGADOR 1 OU 2

			if (count % 2 == 0) {

				System.out.println("Vez do jogador 1: ");

				System.out.println("Digite a linha: ");
				linha = scan.nextInt();

				System.out.println("Digite a coluna: ");
				coluna = scan.nextInt();

				if (met.alterar(linha, coluna, count) == 1) {

					count++;

				}

				if (met.verificaWin() == 1) {

					System.out.println("Voce venceu!");
					
					break;
					
				}

				count++;

			} else {

				System.out.println("vez do jogador 2 ");

				System.out.println("Digite a linha: ");
				linha = scan.nextInt();

				System.out.println("Digite a coluna: ");
				coluna = scan.nextInt();

				if (met.alterar(linha, coluna, count) == 0) {

					count++;

				}

				if (met.verificaWin() == 1) {

					System.out.println("Voce venceu!");
					break;
				}
			}

			if (count == 9) {

				System.out.println("EMPATE!");
				break;
			}

		} while (count != 9);

		
		scan.close();
	}

}
