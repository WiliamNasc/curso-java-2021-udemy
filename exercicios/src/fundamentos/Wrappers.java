package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		Byte byteClass = 100;
		Short shortClass = 10000;
		Integer intClass = 1000000000;
		Long longClass = 1000000000000000000L;
		Float floatClass = 123.10F;
		Double doubleClass = 12.5;
		Boolean booleanClass = Boolean.parseBoolean("true");
		Character charClass = '#';

		System.out.println(byteClass.byteValue());
		System.out.println(shortClass.shortValue());
		System.out.println(intClass);
		System.out.println(longClass.longValue());
		System.out.println(doubleClass);
		System.out.println(floatClass);
		System.out.println(booleanClass);
		System.out.println(booleanClass.toString().toUpperCase());
		System.out.println(charClass.toString().concat("...."));
	}
}