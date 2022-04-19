package onde_parar;
import java.util.Scanner;
public class onde_parar {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Colocando variáveis
		int idoso,gestante,deficiente;
		//Perguntando se é idoso ou não
		System.out.printf("Se voce for idoso(a) digite 0, se nao for digite 9:\n");
		idoso=ler.nextInt(); 
		//Perguntando se é gestante ou não
		System.out.printf("Se voce for gestante digite 1, se nao for digite 9:\n");
		gestante=ler.nextInt();
		//Perguntando se é deficiente fisico ou não
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		deficiente=ler.nextInt();
		//Fazendo condições para informar se pode ou não parar nas vagas
		if (idoso==0) {
			System.out.printf("Voce pode parar na vaga exclusiva para idoso(a)");
		}
			else if (gestante==1)
				System.out.printf("Voce pode parar na vaga exclusiva para gestantes");
			else if (deficiente==2)
				System.out.printf("Voce pode parar na vaga exlcusiva para deficiente fisico(a)");
		}
	}


