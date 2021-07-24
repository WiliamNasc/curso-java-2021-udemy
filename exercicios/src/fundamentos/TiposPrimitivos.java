package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/**
		 * Exemplo: informa��es de funcion�rios
		 */

		// Tipos num�ricos: inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos num�ricos: reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo caractere
		char status = 'A';

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

		// N�mero de viagens
		System.out.println("N�mero de viagens: " + numeroDeVoos / 2);

		// Pontos acumulados
		System.out.println("Pontos acumulados: " + pontosAcumulados / vendasAcumuladas);

		// Sal�rio do usu�rio
		System.out.println("Id: " + id + " Sal�rio: " + salario);

		// Funcion�rio de f�rias
		System.out.println("F�rias: " + estaDeFerias);

		// Status funcion�rio
		System.out.println("Status: " + status);
	}
}