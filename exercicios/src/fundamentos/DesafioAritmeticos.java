package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		// operações
		double primeiraOperacao = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double segundaOperacao = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		double terceiraOperacao = Math.pow((primeiraOperacao - segundaOperacao), 3);
		double quartaOperacao = terceiraOperacao / Math.pow(10, 3);

		// cast no resultado, para pegar somente a parte inteira do valor encontrado
		int resultado = (int) quartaOperacao;
		System.out.println("-> ".concat(String.valueOf(resultado)));
	}
}