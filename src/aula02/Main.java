package aula02;

public class Main {

	public static void main(String[] args) {
		CalculadoraPagamento c = new CalculadoraPagamento("maria", 30, "26/06/1990", 500);
                float ret = c.retornaCalculoFuncionario();
                System.out.println("salário: " + ret);
	}

}
