package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double DIFERENCA = 32;
		final double DIVISAOSIMPLIFICADA = 5.0 / 9.0;

		double temperaturaFahrenheit = 86;
		double temperaturaCelsius = 0;
		temperaturaCelsius = (temperaturaFahrenheit - DIFERENCA) * DIVISAOSIMPLIFICADA;
		System.out.println("O resultado da conversão é: " + temperaturaCelsius + " C°.");

		temperaturaFahrenheit = 150;
		temperaturaCelsius = 0;
		temperaturaCelsius = (temperaturaFahrenheit - DIFERENCA) * DIVISAOSIMPLIFICADA;
		System.out.println("O resultado da conversão é: " + temperaturaCelsius + " C°.");
	}
}