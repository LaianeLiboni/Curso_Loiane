package Exercicios;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		}
}
