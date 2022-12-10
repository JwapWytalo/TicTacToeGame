package Classes;

public class Metodos {

	int i, j, n = 3;
	String matrix[][] = { { "_", "_", "_" }, { "_", "_", "_" }, { "_", "_", "_" } };
	String local[][] = { { "0", "", "" }, { "1", "", "" }, { "2", "", "" } };

	// METODO PARA MOSTRAR O TABULEIRO

	public void tabuleiro() {

		System.out.println("   0   1   2");
		for (i = 0; i < n; i++) {
			System.out.println();
			for (j = 0; j < n; j++) {

				System.out.printf("%s", local[i][j]);
				System.out.printf(" [%s]", matrix[i][j]);

			}

		}

	}

	// ALTERANDO JOGADAS

	public int alterar(int linha, int coluna, int jog) {

		if (checa(linha, coluna) == 0) {

			if (jog % 2 == 0) {

				this.matrix[linha][coluna] = "x";

				tabuleiro();
				return 1;

			} else {

				this.matrix[linha][coluna] = "o";

				tabuleiro();
				return 1;
			}

		} else {

			System.out.println("Pos ocupada!");
			return 0;

		}

	}

	// VERIFICA SE A POSIÇÃO FOI OCUPADA OU NÃO

	public int checa(int linha, int coluna) {

		if (this.matrix[linha][coluna] == "x") {

			return 1;

		} else if (this.matrix[linha][coluna] == "o") {

			return -1;

		} else {

			return 0;

		}
	}

	// VERIFICA SE EXISTE UM VENCEDOR

	public int verificaWin() {

		if ((this.matrix[0][0] == "x" || this.matrix[0][0] == "o")
				&& (this.matrix[0][1] == "x" || this.matrix[0][1] == "o")
				&& (this.matrix[0][2] == "x" || this.matrix[0][2] == "o")
				|| (this.matrix[1][0] == "x" || this.matrix[1][0] == "o")
						&& (this.matrix[1][1] == "x" || this.matrix[1][1] == "o")
						&& (this.matrix[1][2] == "x" || this.matrix[1][2] == "o")
				|| (this.matrix[2][0] == "x" || this.matrix[2][0] == "o")
						&& (this.matrix[2][1] == "x" || this.matrix[2][1] == "o")
						&& (this.matrix[2][2] == "x" || this.matrix[2][2] == "o")
				|| (matrix[0][0] == "x" || matrix[0][0] == "o") && (matrix[1][1] == "x" || matrix[1][1] == "o")
						&& (matrix[2][2] == "x" || matrix[2][2] == "o")) {

			return 1;

		} else {

			return 0;
		}

	}

}
