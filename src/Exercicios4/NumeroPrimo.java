package Exercicios4;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		int num = scanner.nextInt();
		
		boolean primo = true;
				
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
			System.out.println(" N�o � primo");
			primo = false;
			}
		}
		
		if (primo) {
			System.out.println("� n�mero primo");
		}
	}
}
