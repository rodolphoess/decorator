package decorator;

public class Expresso extends Bebida {
	
	public Expresso() {
		this.descricao = "Café Expresso";
	}

	@Override
	public double getPreco() {
		return 1.50;
	}
}
