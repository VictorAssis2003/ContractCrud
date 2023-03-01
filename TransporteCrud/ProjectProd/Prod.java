package ProjectProd;

import java.util.Scanner;

import Interface.UserClientInterface;

public class Prod {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Soja bem vindo ao Mercado Louco!");
		System.out.print("Você ja tem uma conta?[S/N] ");
		String hasAccount = sc.next().toUpperCase();
		if (hasAccount.contains("N")) {
			System.out.println(
					"Gostaria de se cadastrar? Com uma conta voce pode realizar transações pelo app, \nsem uma você pode apenas olhar os produtos.");
			System.out.print("Quer se cadastrar?[S/N] ");
			String accountCadastrarOption = sc.next().toUpperCase();
			if (accountCadastrarOption.contains("S")) {
				try {
					UserClientInterface.userInterface();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Muito bom! Agora vamos cadastrar um nome de usuario e senha!");
				

			}
		}

	}
}
