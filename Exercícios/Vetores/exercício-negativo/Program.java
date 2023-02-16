package application;

import java.util.Scanner;

import entities.Negativo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Quantos números você vai digitar?: ");
		int quantity = sc.nextInt();
		Negativo[] vect = new Negativo[quantity];
		
		for(int i=0; i < quantity; i++) {
			System.out.print("Digite um número: ");
			number = sc.nextInt(); 
			vect[i] = new Negativo(number);
		}
		
		System.out.println("Números negativo: ");
		
		for(int i=0; i < quantity; i++) {
			if(vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		sc.close();

	}

}
