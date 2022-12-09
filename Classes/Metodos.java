package Classes;

public class Metodos {
	int i, j, n = 3;
	int matrix[][] = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };

	public void menu() {

		for (i = 0; i < n; i++) {
			System.out.println();
			for (j = 0; j < n; j++) {

				System.out.printf("[%d]", matrix[i][j]);

			}

		}

	}

	public void alterar(int linha, int coluna, int jog) {

		if (checa(linha, coluna) == 0) {

			if (jog % 2 == 0) {

				this.matrix[linha][coluna] = 1;

				if (verificaWin() == 1) {

					System.out.println("Voce venceu!");

				} else {

					menu();

				}

			} else {

				this.matrix[linha][coluna] = 0;

				if (verificaWin() == 1) {

					System.out.println("Voce venceu!");

				} else {

					menu();

				}

			}

		} else {

			System.out.println("Pos ocupada!");

		}

	}

	public int checa(int linha, int coluna) {

		if (this.matrix[linha][coluna] == 1) {

			return 1;

		} else if (this.matrix[linha][coluna] == 0) {

			return -1;

		} else {

			return 0;

		}
	}

	public int verificaWin() {

		if ((this.matrix[0][0] == 1 || this.matrix[0][0] == 0) && (this.matrix[0][1] == 1 || this.matrix[0][1] == 0)
				&& (this.matrix[0][2] == 1 || this.matrix[0][2] == 0)
				|| (this.matrix[1][0] == 1 || this.matrix[1][0] == 0)
				&& (this.matrix[1][1] == 1 || this.matrix[1][1] == 0)
				&& (this.matrix[1][2] == 1 || this.matrix[1][2] == 0)
				|| (this.matrix[2][0] == 1 || this.matrix[2][0] == 0)
				&& (this.matrix[2][1] == 1 || this.matrix[2][1] == 0)
				&& (this.matrix[2][2] == 1 || this.matrix[2][2] == 0)) {

			return 1;

		} else {

			return 0;
		}

	}

}
