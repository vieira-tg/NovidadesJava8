package stream;

import java.math.BigDecimal;

import lambda.CargaProdutoUtil;

public class Teste {
	public static void main(String[] args) {
		CargaProdutoUtil.getProduto().stream().filter(p -> p.getQtd().compareTo(BigDecimal.valueOf(50)) == -1).forEach(p -> {
			System.out.println("SKU:" + p.getSku());
			System.out.println("Qtd:" + p.getQtd());
		});
	}
}
