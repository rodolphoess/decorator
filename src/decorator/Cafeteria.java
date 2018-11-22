package decorator;

class Cafeteria {

	public static void main(String[] args) {
		Bebida expresso = new Expresso();
		System.out.println(expresso.getDescricao() + " | R$ " + expresso.getPreco());
		
		Bebida creme = new Creme(expresso);
		System.out.println(creme.getDescricao() + " | R$ " + creme.getPreco());
		
		Bebida caramelo = new Caramelo(creme);
		Bebida moca = new Moca(caramelo);
		System.out.println(moca.getDescricao() + " | R$ " + moca.getPreco());
	}

}
