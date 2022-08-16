package datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Teste {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Tiago Vieira", LocalDate.of(1991, Month.NOVEMBER, 14));

		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

		if (idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
		} else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
		}

	}
}
