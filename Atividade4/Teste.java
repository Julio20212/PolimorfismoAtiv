package Atividade4;

public class Teste {
	public static void main(String[] args) {

		Processador processador = new Processador("Intel", "3.5 GHz");

		Computador computador = new Computador("Dell Inspiron", processador);

		computador.exibirInfo();
	}
}