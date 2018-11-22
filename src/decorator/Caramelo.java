package decorator;

public class Caramelo extends DecoratorBebida {

	protected Caramelo(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Caramelo";
	}

	@Override
	public double getPreco() {
		return bebida.getPreco() + 0.85;
	}

}
