package aula02;

public class CalculadoraPagamento {

	float resultadoFinal = 0;

	public CalculadoraPagamento(Funcionario funcionario) throws IllegalAccessException {
		String dataNascimento = null;
		int idade = 0;
		String nome = null;
		float salario = 0;
		
		Funcionario funcionarioA = new Funcionario();		
		funcionarioA.dataNascimento = dataNascimento;		
		funcionarioA.idade = idade;		
		funcionarioA.nome = nome;		
		funcionarioA.salario = salario;
		
		try {
			validaFuncionario(funcionarioA);
		} catch (IllegalArgumentException i) {
			System.out.println("errro na validaçãoo");
		}
		resultadoFinal = calcularSalario(funcionarioA);
	}

	void validaFuncionario(Funcionario funcionario) throws IllegalAccessException {
		if (funcionario.nome.equals("") || funcionario.idade == 0) {
			throw new IllegalArgumentException("error funcionario");
		}
	}

	public float retornaCalculoFuncionario() {
		return resultadoFinal;
	}

	private float calcularSalario(Funcionario funcionario) {
		float resultado = 0;

		if (funcionario.salario < 1000) {
			float umPorCento = 0.1f;
			resultado = calcularSalario(funcionario, umPorCento);
		}
		if (funcionario.salario > 1000) {
			float doisPorCento = 0.2f;
			resultado = calcularSalario(funcionario, doisPorCento);
		}

		return resultado;
	}

	private float calcularSalario(Funcionario funcionario, float percentual) {
		return (funcionario.salario * percentual) + funcionario.salario;
	}

}
