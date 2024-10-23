package Atividade1;

public class Moto extends Brinquedo {
	public Moto() {
		super("Verde", "Hornet", "Vespa", 150);
	}

	@Override
	public void mover() {
		System.out.println(getNome() + " da cor " + getCor() + " do tipo " + getTipo() + " está correndo a " + getVelocidade() + " km/h.");
	}
}