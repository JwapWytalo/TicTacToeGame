package Teste;

import java.util.*;
import Classes.*;

public class App {

	public static void main(String[] args) {

		// VARIAVEIS

		Solo sol = new Solo();
		Dupla duo = new Dupla();
		Scanner scan = new Scanner(System.in);
		int linha, coluna, count = 0, over, modo;

		System.out.println("Digite 1 para jogar sozinho ou 2 para jugaar em dupla");
		modo = scan.nextInt();

		switch (modo) {

		case 1:

			sol.tabuleiro();

			System.out.println();

			// LOOP QUE CONTA AS JOGADAS

			do {

				// CONDIÇÃO PARA IDENTIFICAR O JOGADOR 1 OU 2

				if (count % 2 == 0) {

					System.out.println("\nVez do jogador 1: ");

					System.out.println("Digite a linha e a coluna: ");
					linha = scan.nextInt();
					coluna = scan.nextInt();

					if (sol.alterar(linha, coluna, count) != -1) {

						count++;

					}

					if (sol.verificaWin() == 1) {

						System.out.println("Voce venceu!");

						break;

					}

				} else {

					System.out.println("\nvez do jogador 2 ");

					System.out.println("Digite a linha e a coluna: ");
					linha = scan.nextInt();
					coluna = scan.nextInt();

					if (sol.alterar(linha, coluna, count) != -1) {

						count++;

					}

					if (sol.verificaWin() == 1) {

						System.out.println("Voce venceu!");
						break;
					}
				}

				if (count == 9) {

					System.out.println("EMPATE!");
					break;
				}

			} while (count != 9);

			break;
			
		case 2:
			
			duo.tabuleiro();
			
			do {

				// CONDIÇÃO PARA IDENTIFICAR O JOGADOR 1 OU 2

				if (count % 2 == 0) {

					System.out.println("\nVez do jogador 1: ");

					System.out.println("Digite a linha e a coluna: ");
					linha = scan.nextInt();
					coluna = scan.nextInt();

					if (duo.alterar(linha, coluna, count) != -1) {

						count++;

					}

					if (sol.verificaWin() == 1) {

						System.out.println("Voce venceu!");

						break;

					}

				} else {

					System.out.println("\nvez do jogador 2 ");
					duo.maquina(count);
					

					if (duo.maquina(count) != -1) {

						count++;

					}

					if (sol.verificaWin() == 1) {

						System.out.println("Voce venceu!");
						break;
					}
				}

				if (count == 9) {

					System.out.println("EMPATE!");
					break;
				}

			} while (count != 9);
			
		} 

		scan.close();
	}

}
