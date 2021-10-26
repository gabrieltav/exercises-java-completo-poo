// Autor Gabriel Tavares
package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();
		String palindromo = "";
		
		for(int i = palavra.length() -1; i >= 0; i--){
			
			palindromo += palavra.charAt(i);

		}
		
		if(palindromo.equals(palavra)) {
			System.out.print("A palavra digitada é um palíndromo!" + "\n" + palindromo);
		}
		else {
			System.out.print("A palavra digitada não é um palíndromo!" + "\n" + palindromo);
			
		}
		sc.close();
	}
}