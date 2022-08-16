package lambda;

public class TesteLambda {
	public static void main(String[] args) {
		CargaProdutoUtil.getProduto().stream().forEach(p -> {
			System.out.println("SKU:" + p.getSku());
			System.out.println("Qtd:" + p.getQtd());
			
		});
	}

}
