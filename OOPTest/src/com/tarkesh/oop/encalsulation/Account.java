package com.tarkesh.oop.encalsulation;

public class Account {
	int account_number, account_balanace;

	public void depositAmount(int amount) {
		if (amount < 1) {
			System.out.println("Amount Deposit Not Possible");
		} else {
			account_balanace = amount;
		}
	}

	public int getAmount() {
		return account_balanace;
	}
	public void take(int amount){
		account_balanace=account_balanace-amount;
	}
	public static void main(String[] args) {
		Account account=new Account();
		account.depositAmount(5000);
		account.take(2000);
		System.out.println(account.getAmount());
	}

}
