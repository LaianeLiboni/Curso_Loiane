package Exercicios3;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		
		double media = (nota1 + nota2) / 2;
		System.out.println("A m�dia das notas �: " + media);
		
		String aproveitamento = "";
		if (media >= 9 && media <= 10) {
			aproveitamento = "A";
		}else if(media >= 7.5 && media < 9) {
			aproveitamento = "B";
		}else if(media >= 6 && media < 7.5) {
			aproveitamento = "C";
		}else if(media >= 4 && media < 6) {
			aproveitamento = "D";
		}else if(media >= 4 && media < 0) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch(aproveitamento) {
			case "A":
			case "B":
			case "C": System.out.println("APROVADO"); break;
			case "D":
			case "E": System.out.println("REPROVADO"); break;	
		}			
	}
}
