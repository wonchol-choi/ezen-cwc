package objectClass;
//은행계좌(통장) 클래스
public class Account {
	//멤버변수(필드, 속성)
	static final String BANKNAME="신한은행";
	String accountNo; //계좌번호
	String ownerName;  //예금주이름
	int balance;   //잔액
	
	//생성자
	public Account() {
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//예금한다 메서드
	void deposit(int amount) {
		balance+=amount;  //balance=balance+amount;
	}
	//인출한다 메서드
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;   //balance=balance-amount;
		return amount;
	}
}
