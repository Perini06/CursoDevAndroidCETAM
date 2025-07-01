package model;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ryan", 20, "Ciência da Computação");
        aluno1.exibirDados();
        
        Aluno aluno2 = new Aluno("Teste", 19, "Teste");
        aluno2.exibirDados();
	}

}
