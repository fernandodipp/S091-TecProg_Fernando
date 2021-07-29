package main;

public class ContaCorrente implements Conta {

	@Override
	public void depositar(float valor) {
		// TODO Auto-generated method stub
		System.out.println("executando depositar de ContaCorrente: " + valor);
	}

	@Override
	public void sacar(float valor) {
		// TODO Auto-generated method stub
		System.out.println("executando sacar de ContaCorrente: " + valor);
	}
	
	

}
