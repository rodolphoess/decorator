package decorator;

public class Creme extends DecoratorBebida {

	protected Creme(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Creme";
	}

	@Override
	public double getPreco() {
		return bebida.getPreco() + 0.50;
	}

}
