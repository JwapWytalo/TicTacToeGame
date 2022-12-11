package Classes;
import java.util.*;

public class Dupla {
	
	int i, j, n = 3;
	
	String matrix[][] = { { "_", "_", "_" }, { "_", "_", "_" }, { "_", "_", "_" } };
	String local[][] = { { "0", "", "" }, { "1", "", "" }, { "2", "", "" } };

	
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
	
	public  int alterar(int linha, int coluna, int jog){
		
		if (checa(linha, coluna) == 0) {

			if (jog % 2 == 0) {

				this.matrix[linha][coluna] = "x";

				tabuleiro();
				return 1;

			} else {

				this.matrix[linha][coluna] = "o";

				tabuleiro();
				return 0;
			}

		} else {

			System.out.println("Pos ocupada!");
			return -1;

		}
		
	}
	
	public int maquina(int count) {
		int linha, coluna;
		
		Random aleatorio = new Random();
		
		linha = aleatorio.nextInt(3);
		coluna = aleatorio.nextInt(3);
		
		
		alterar(linha, coluna, count);
		
		return 0;
		
	}
	
	public int checa(int linha, int coluna) {

		if (this.matrix[linha][coluna] == "x") {

			return 1;

		} else if (this.matrix[linha][coluna] == "o") {

			return -1;

		} else {

			return 0;

		}
	}
	
	
	
	
	
	
	

}
