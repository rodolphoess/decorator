package decorator;

public abstract class Bebida {
	protected String descricao;
	
	protected Bebida() {
		this.descricao = "";
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	abstract public double getPreco(); 
}
