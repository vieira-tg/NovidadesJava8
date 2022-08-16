package lambda;

import java.math.BigDecimal;

public class Produto {

	private String sku;
	private BigDecimal qtd;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public Produto(String sku, BigDecimal qtd) {
		super();
		this.sku = sku;
		this.qtd = qtd;
	}	
	
}
