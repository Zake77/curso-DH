package aula2;

public class Projeto2 {

	public static void main(String[] args) {
		
		int idadeIsaque = 25;
		int idadeLuke = 22;
		if (idadeIsaque >= 18 && idadeLuke >= 18)
			System.out.println("Ambos est�o aptos a tirar a CNH.");
				// cnh
		int idadeJulia = 33;
		int idadeAna = 44;
		if (idadeJulia <= 30 || idadeAna >= 30)
			System.out.println("Ambos podem assistir ao jogo.");
		// jogo
		
	
		
		
		int idadeLucia = 60;
		if (idadeLucia != 65)
			System.out.println("A passagem dever� ser paga");
		// passagem
		
		char sexo = 'F';
		if (sexo == 'M') {
			System.out.println("Seu sexo � Masculino");
		}
		else {
				System.out.println("Seu sexo � Feminino");
				// sexo
		}
		
		char sexo2 = 'A';
		String mensagem = sexo2 == 'A' ? "Seu sexo � Feminino" : "Seu sexo � Masculino";
		System.out.print(mensagem);
		
		
	}
	
}