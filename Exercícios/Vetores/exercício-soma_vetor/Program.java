package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operations;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double number, sum, media;
		
		System.out.print("Quantos números você vai digitar?: ");
		int quantity = sc.nextInt();
		Operations[] vect = new Operations[quantity];
		
		for(int i=0; i < quantity; i++) {
			System.out.print("Digite um número: ");
			number = sc.nextDouble();
			vect[i] = new Operations(number);
		}
		sum = 0;
		
		for(int i=0; i < quantity; i++) {
			sum = sum + vect[i].getNumber();
		}
		
		media = sum / quantity;
		
		System.out.println();
		
		System.out.print("Valores digitados: ");
		
		for(int i=0; i < quantity; i++) {
			System.out.print(vect[i].getNumber() + " ");
		}

		System.out.println("");
		
		System.out.println("SOMA = " + sum);
		System.out.printf("Média = %.2f%n", media);
		
		sc.close();

	}

}
