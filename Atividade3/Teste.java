package Atividade3;

public class Teste {
	public static void main(String[] args) {

		String autor = "Machado de Assis";
		String titulo = "Dom Casmurro";

		Livro livro = new Livro(autor, titulo);

		Biblioteca biblioteca = new Biblioteca("Central");

		biblioteca.exibirInfo();
		livro.exibirInfo();
	}
}