package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";

		/*
		 * Substitui o valor antigo pelo novo e armazena na pr�pria vari�vel, para que a
		 * mudan�a possa ser feita efetivamente.
		 */
		s = s.replace("X", "Senhora");

		/*
		 * Deixa toda a string em mai�sculo e armazena na pr�pria vari�vel, para que a
		 * mudan�a possa ser feita, efetivamente.
		 */
		s = s.toUpperCase();

		/*
		 * Concatena o valor � string e armazena na pr�pria vari�vel, para que a mudan�a
		 * possa ser feita, efetivamente.
		 */
		s = s.concat(" !!!");

		System.out.println(s);

		String x = "WIL".toLowerCase();
		System.out.println(x);

		String y = "Bom dia X".replace("X", "gui").toUpperCase().concat(" !!!");

		System.out.println(y);
	}
}