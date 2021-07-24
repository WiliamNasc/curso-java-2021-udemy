package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String string = new String("Objeto");

		int i = 5;

		System.out.printf("string -> %s%n%d -> Primitivo", string.toUpperCase(), i);
	}
}