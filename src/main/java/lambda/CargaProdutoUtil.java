package lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CargaProdutoUtil {
	
	
	public static List<Produto> getProduto(){
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = null;
	  	for (int i = 0; i < 100; i++) {
	  		produto = new Produto(String.valueOf(i), BigDecimal.valueOf(i ).add(BigDecimal.TEN));
	  		produtos.add(produto);
		}
	  	
	  	return produtos;		
	}

}
