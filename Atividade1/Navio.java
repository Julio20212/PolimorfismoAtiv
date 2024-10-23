package Atividade1;

public class Navio extends Brinquedo {
	public Navio() {
		super("Branca", "Cruzeiro do Neymar", "Aquático", 40);
	}

	@Override
	public void mover() {
		System.out.println(getNome() + " da cor " + getCor() + " do tipo " + getTipo() + " está navegando no mar a " + getVelocidade() + " km/h.");
	}
}