package Atividade1;

class Carro extends Brinquedo {

	public Carro() {
		super("Amarela", "Camaro", "Esportivo", 120);
	}

	@Override
	public void mover() {
		System.out.println(getNome() + " da cor " + getCor() + " do tipo " + getTipo() + " está correndo a " + getVelocidade() + " km/h.");
	}
}