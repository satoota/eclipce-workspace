
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		System.out.println("");
		int idade = 12;
		int quantidadePessoas=2;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 22 anos");
			System.out.println("Seja bem vindo");
		} else {
			if(quantidadePessoas>=2) {
				System.out.println("Voce nao tem 18, mas pode entrar pois esta acompanhado!");
			} else {	
			System.out.println("Infelizmente voce nao tem mais de 18 anos,e n�o esta acompanhado");
			}
		}
	}
}