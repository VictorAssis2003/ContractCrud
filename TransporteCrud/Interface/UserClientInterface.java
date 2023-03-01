package Interface;

import java.time.LocalDate;
import java.util.Scanner;

import Buyer_Seller.Buyer;
import Payment.Bank;
import UserInfo.userInfo;

public class UserClientInterface {

	public static void userInterface(Buyer client) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos cadastrar um nova conta então!");
		System.out.println();
		System.out.println("Precisamos de alguns dados para começar:");
		System.out.println();
		System.out.print("Nome completo: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		Integer cpf = sc.nextInt();
		System.out.print("Email:  ");
		String email = sc.next();
		System.out.print("Idade:");
		Integer age = sc.nextInt();
		if (age < 18) {
			throw new Exception("Menores de idade não podem se cadastrar :/");
		
		} else {
			System.out.print("Saldo: ");
			Double accountBalance = sc.nextDouble();
			System.out.print("Crédito: ");
			Double credit = sc.nextDouble();
			System.out.print("Instituição Financeira: ");
			String bank = sc.next();
			System.out.print("CEP: ");
			Integer cep = sc.nextInt();
			LocalDate date = LocalDate.now();
			client = new Buyer(nome, cpf, email, age, accountBalance, credit, new Bank(bank), cep, date);
			System.out.println(client);

		}
		

	}
	public static void userNameAndPassword() {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Username: ");
		String username = sc.next();
		System.out.print("Senha: ");
		String password = sc.next();
		Buyer userinformation = new Buyer();
		userInfo userinfo = new userInfo(username, password, userinformation );
	}

}
