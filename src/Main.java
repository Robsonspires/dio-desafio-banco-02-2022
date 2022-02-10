
public class Main {

	public static void main(String[] args) {
		
		Cliente robson = new Cliente();
		robson.setNome("Robson");
		
		Conta cc = new ContaCorrente(robson);
		Conta poupanca = new ContaPoupanca(robson);

		cc.depositar(100);
		cc.transferir(70, poupanca);

		cc.imprimirExtrato();
		System.out.println("");
		poupanca.imprimirExtrato();

	}

}
