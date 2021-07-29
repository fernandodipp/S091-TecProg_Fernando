package main;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa maria = new Pessoa();
		maria.nome = "maria da silva";
		
		Endereco enderecoMaria = new Endereco();
		enderecoMaria.nomeRua = "assis brasil";
		
		maria.endereco = enderecoMaria;
		
		System.out.println(maria.nome + maria.endereco.nomeRua);
		
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Organizacoes Tabajara";
		pj.cnpj = "88019013000153";
		Endereco enderecoPJ = new Endereco();
		enderecoPJ.nomeRua = "Assis Brasil";
		pj.endereco = enderecoPJ;
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "fulano de tal";
		pf.cpf = "16605748034";
		Endereco enderecoPF = new Endereco();
		enderecoPF.nomeRua = "Rua dos Bobos";
		pf.endereco = enderecoPF;
		
		System.out.println(pj.nome);
		System.out.println(pj.cnpj);
		System.out.println(pj.endereco.nomeRua);
		System.out.println(pf.nome);
		System.out.println(pf.cpf);
		System.out.println(pf.endereco.nomeRua);
		
		//uso de interfacer (contratos) com polimorfismo
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		depositaSacaNaConta(cc);
		depositaSacaNaConta(cp);
	}
	public static void depositaSacaNaConta(Conta conta) {
		conta.depositar(100f);
		conta.sacar(500f);
	}
		
}