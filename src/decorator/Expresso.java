package decorator;

public class Expresso extends Bebida {
	
	public Expresso() {
		this.descricao = "Caf� Expresso";
	}

	@Override
	public double getPreco() {
		return 1.50;
	}
}
