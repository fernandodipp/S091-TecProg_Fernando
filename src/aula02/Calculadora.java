package aula02;

public class Calculadora {
	int calcularSoma (int numeroA, int numeroB) {
		return numeroA + numeroB;
	}
	
	boolean verificaId (String id) {
		if(id == null || id == "") {
			return false;
		}else {
			//busca chave
			return true;
		}
	}
	
	int buscarChave(String id) throws Exception{
		boolean idInvalido = id == null || id == "";
		
		if (idInvalido) {
			throw new Exception("ID invalido");
		}else {
			
		}
	}
}
