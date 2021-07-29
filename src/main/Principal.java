package main;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa maria = new Pessoa();
		maria.nome = "maria da silva";
		
		Endereco enderecoMaria = new Endereco();
		enderecoMaria.nomeRua = "assis brasil";
		
		maria.endereco = enderecoMaria;
		
		System.out.println(maria.nome + maria.endereco);


	}

}