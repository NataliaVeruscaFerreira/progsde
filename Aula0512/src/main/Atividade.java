package main;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		// TODO Auto-generated method 
		
		int numero, contador = 0;
		
		for(int i = 1; i <= 10; i++) {
		System.out.println("Digite um número inteiro:");
		numero = leitor.nextInt();
		
		if (numero>= 10 && numero <=50){
			System.out.println("Número está no intervalo!");
			contador++;
			System.out.println("Número no intervalo até agora!");
		}
		}
		
		
		

	}

}
