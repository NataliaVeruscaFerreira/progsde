package main;

public class MenorValor {

	public static void main(String[] args) {
		Scanner elitor = new Scanner(System.in);
		int numero, menor;
		
		for (int i=1; i<= 5; i++) {
			System.out.println("Digite um numero inteiro:");
			numero = leitor.nextInt();
			
			if (i == 1) {
				maior = numero;
				menor = numero;
				
			}
			else if (numero < menor) {
			menor = numero;
			System.out.println("Menor substituído!");
			}else if (numero > menor) {
			maior = numero;
		System.out.println("Maior substituído!");
		
		}
	}
		
		System.out.println("O menor número é:"+ menor);
		System.out.println("O maior número é:"+ maior);
				
				

