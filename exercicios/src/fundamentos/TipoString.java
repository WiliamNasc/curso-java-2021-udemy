package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// mostra a letra do índice 2
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";

		// mostra a variável concatenada com outros valores
		System.out.println(s.concat(" !!!"));
		System.out.println(s + " !!!");

		// mostra se a string começa com a palavra Boa, considerando letras maiúsculas e
		// minúsculas
		System.out.println(s.startsWith("Boa"));

		// mostra se a string começa com a palavra Boa, desconsiderando letras
		// maiúsculas e
		// minúsculas
		System.out.println(s.toLowerCase().startsWith("boa"));

		// mostra se a string termina com a palavra tarde
		System.out.println(s.endsWith("tarde!"));

		// mostra um valor inteiro, com o tamanho da string
		System.out.println(s.length());

		// mostra se a string é igual a frase Boa tarde, considerando letras maiúsculas
		// e
		// minúsculas
		System.out.println(s.equals("boa tarde"));

		// mostra se a string é igual a frase Boa tarde, desconsiderando letras
		// maiúsculas e
		// minúsculas
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Wiliam";
		var sobrenome = "Nascimento";
		var idade = 21;
		var salario = 12345.987;

		System.out.printf("O meu nome é %s %s, tenho %d anos, e ganho R$ %.2f. %n", nome, sobrenome, idade, salario);

		// formata uma frase, atríbui em uma variável do tipo string, e a mostra
		String frase = String.format("O meu nome é %s %s, tenho %d anos, e ganho R$ %.2f. %n", nome, sobrenome, idade,
				salario);
		System.out.println(frase);

		// mostra se existe a palavra qual, dentro da frase Frase qualquer
		System.out.println("Frase qualquer".contains("qual"));

		// mostra o índice onde se inicia a palavra qual, dentro da frase Frase qualquer
		System.out.println("Frase qualquer".indexOf("qual"));

		// mostra uma parte da frase Frase qualquer, a partir de um determinado índice
		// da string
		System.out.println("Frase qualquer".substring(6));

		// mostra uma parte da frase Frase qualquer, de acordo com um intervalo de
		// índices determinado (inicial, final)
		// da string
		System.out.println("Frase qualquer".substring(0, 6));
	}
}