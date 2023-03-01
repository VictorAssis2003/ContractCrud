package Buyer_Seller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import Payment.Bank;
import Product.Inventary;

public class Buyer {
	private String name;
	private Integer cpf;
	private String email;
	private Integer age;
	private Double accountBalance;
	private Double credit;
	private Bank bank;
	private List<Inventary> inventary;
	private Integer cep;
	private LocalDate accountDate;

	public Buyer() {

	}

	public Buyer(String name, Integer cpf, String email, Integer age, Double accountBalance, Double credit, Bank bank,
			Integer cep, LocalDate accountDate) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.age = age;
		this.accountBalance = accountBalance;
		this.credit = credit;
		this.bank = bank;
		this.cep = cep;
		this.accountDate = accountDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<Inventary> getInventary() {
		return inventary;
	}

	public void setInventary(List<Inventary> inventary) {
		this.inventary = inventary;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public LocalDate getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(LocalDate accountDate) {
		this.accountDate = accountDate;
	}

	@Override
	public String toString() {
		return "DADOS:\n"
				+ "\nNome: " 
				+ name
				+"\nCPF: "
				+ cpf
				+"\nEmail: "
				+ email
				+"\nIdade: "
				+ age
				+"\nSaldo: $"
				+ accountBalance
				+"\nCrédito: $"
				+ credit
				+"\nInstituição Financeira: "
				+ bank.getName()
				+"\nCEP: "
				+ cep;
	}

}
