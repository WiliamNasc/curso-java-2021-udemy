package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Boa ");
		System.out.println("tarde!");
		System.out.println("\n\n\n");

		System.out.println("Boa");
		System.out.println("tarde!");

		System.out.printf("Mega sena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "Wiliam");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o seu nome: ");
		var nomeInserido = scanner.nextLine();

		System.out.print("Insira o seu sobrenome: ");
		var sobrenomeInserido = scanner.nextLine();

		System.out.print("Insira a sua idade: ");
		var idadeInserida = scanner.nextInt();

		scanner.close();

		System.out.printf("O seu nome é %s, e você tem %d anos de idade.",
				nomeInserido.concat(" ").concat(sobrenomeInserido), idadeInserida);
	}
}