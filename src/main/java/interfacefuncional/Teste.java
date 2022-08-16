package interfacefuncional;

import java.math.BigDecimal;

public class Teste {
	public static void main(String[] args) {

		Calculadora calculadora;

		calculadora = (x, y) -> {
			return x.divide(y);
		};

		System.out.println(calculadora.calcular(BigDecimal.TEN, BigDecimal.ONE));

		calculadora = (x, y) -> {
			return x.add(y);
		};

		System.out.println(calculadora.calcular(BigDecimal.TEN, BigDecimal.ONE));
	}
}
