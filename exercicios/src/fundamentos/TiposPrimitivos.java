package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/**
		 * Exemplo: informações de funcionários
		 */

		// Tipos numéricos: inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos numéricos: reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo caractere
		char status = 'A';

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

		// Número de viagens
		System.out.println("Número de viagens: " + numeroDeVoos / 2);

		// Pontos acumulados
		System.out.println("Pontos acumulados: " + pontosAcumulados / vendasAcumuladas);

		// Salário do usuário
		System.out.println("Id: " + id + " Salário: " + salario);

		// Funcionário de férias
		System.out.println("Férias: " + estaDeFerias);

		// Status funcionário
		System.out.println("Status: " + status);
	}
}