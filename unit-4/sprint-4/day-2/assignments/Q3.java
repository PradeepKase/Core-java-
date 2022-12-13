package day2;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("123123");
		int depsit=200;
		int withdraw=300;
		a.deposit(depsit);
		System.out.println(a.withdraw(withdraw));
		if(withdraw>depsit)
			throw new ArithmeticException("InsufficientFundException");
		else
			System.out.println("withdraw success full");
}

}
class Account{

	String accountNumber;
	double balance;
	void deposit(int i) {
		System.out.println(i);
	}
	double withdraw(int j){
		return j;
	}
	Account(String accountNumber){
		accountNumber=accountNumber;
	}
}
//class AccountDemo{
//	
//}