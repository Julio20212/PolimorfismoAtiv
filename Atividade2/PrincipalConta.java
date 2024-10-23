package Atividade2;

public class PrincipalConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("16543-8", 20000.0);
		Cliente cliente = new Cliente("Carlos", conta);

		cliente.exibirInfo();
	}

}
