package Atividade3;

class Biblioteca {
	private String nome; 

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    
    public void exibirInfo() {
        System.out.println("Biblioteca: " + nome);
    }
}