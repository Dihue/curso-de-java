package Programacion.Cuatrimestre_02.Clases.C08_25;

public class Account {

	// Atributos
	private int accountNumber;
	private double balance;

	// Getters y setters
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	// Métodos
	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		if (balance > amount) {
			balance -= amount;
		} else {
			System.out.println("Amount withdrawn exceeds the current balance");
		}
	}

	@Override
	public String toString() {
		return "Account:\n" +
			"Number = " + accountNumber +
			"\nBalance = " + balance;
	}

	// Constructor
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}


class Main {
	public static void main(String[] args) {
		Account cuenta1 = new Account(1, 0);

		cuenta1.setBalance(500);
		cuenta1.credit(1000);
		cuenta1.debit(500);
		cuenta1.debit(400);

		System.out.println(cuenta1.toString());
	}
}
