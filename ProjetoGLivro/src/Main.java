import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro("Frieren","Kanehito Yamada", 192, 50);
		int opcao, val, qntsPegou = 0;
		
		System.out.println("--- Frieren: Beyond Journey's ---");
		System.out.println("[1]Pegar Emprestado");
		System.out.println("[2]Devolver");
		System.out.println("[3]Verificar disponibilidade");
		System.out.println("[4]Verificar quantos pegou");
		System.out.println("[0]Sair");
		
		opcao = sc.nextInt();
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				System.out.println("Quantos livros gostaria de pegar emprestado?");
				val = sc.nextInt();
				livro.emprestarLivro(val);
				qntsPegou += val;
				break;
			case 2:
				System.out.println("Quantos livros vai devolver agora? ");
				val = sc.nextInt();
				livro.devolverLivro(val);
				break;
			case 3:
				livro.verificarLivro();
				break;
			case 4:
				System.out.println("Essa é a quantidade de livros que pegou:");
				livro.verificarQuantosPegou(qntsPegou);
				break;
			case 0:
				System.out.println("Saindo...");
				return;
			default: 
				System.out.println("Opção Invalida");
				break;
			}
			System.out.println("\n --- Frieren: Beyond Journey's ---");
			System.out.println("[1]Pegar Emprestado");
			System.out.println("[2]Devolver");
			System.out.println("[3]Verificar disponibilidade");
			System.out.println("[4]Verificar quantos pegou");
			System.out.println("[0]Sair");
			
			opcao = sc.nextInt();
		}
		
		
		

	}

}
