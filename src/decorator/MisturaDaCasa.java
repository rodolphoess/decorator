package decorator;

public class MisturaDaCasa extends Bebida {
	
	public MisturaDaCasa() {
		this.descricao = "Café Mistura da Casa";
	}

	@Override
	public double getPreco() {
		return 2.80;
	}

}
