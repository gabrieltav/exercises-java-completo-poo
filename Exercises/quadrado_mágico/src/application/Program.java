package application;

public class Program {
	
	public static boolean ehQuadradoMagico(int [] [] matriz) {
		int soma = 0;
		int somaDeElementos = 0;
		
		// somar elementos da primeira linha
		for (int j = 0; j < matriz[0].length; j++) {
			soma += matriz[0][j];
		}
		
		// Somar as demais linhas
		for(int i = 1; i < matriz.length; i++) {
			somaDeElementos = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				somaDeElementos += matriz[i][j];
			}
			if(somaDeElementos != soma) {
				return false; // não é quadrado mágico
			}
		}
		
		//somar as colunas
		for(int j = 0; j < matriz[0].length; j++) {
			somaDeElementos = 0;
			for(int i = 0; i < matriz.length; i++) {
				somaDeElementos += matriz[i][j];
			}
			if(somaDeElementos != soma) {
				return false; // não é quadrado mágico
			}
		}
		
		// somar a diagonal principal
		somaDeElementos = 0;
		for(int i = 0; i < matriz.length; i++) {
			somaDeElementos += matriz[i][i];
		}
		if(somaDeElementos != soma) {
			return false;
		}
		
		// Somar diagonal secundária
		somaDeElementos = 0;
		int i = 0;
		for(int j = matriz.length -1; j >= 0; j--) {
			somaDeElementos += matriz[i][j];
			i++;
		}
		if(somaDeElementos != soma) {
			return false;
		}
		return true; // é quadrado mágico
	}

	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		matriz[0][0] = 2;
		matriz[0][1] = 7;
		matriz[0][2] = 6;
		matriz[1][0] = 9;
		matriz[1][1] = 5;
		matriz[1][2] = 1;
		matriz[2][0] = 4;
		matriz[2][1] = 3;
		matriz[2][2] = 8;
		
		if(ehQuadradoMagico(matriz)) {
			System.out.println("Matriz é quadrado mágico");
		}
		else {
			System.out.println("Matriz não é quadrado mágico");
		}
	}
}
