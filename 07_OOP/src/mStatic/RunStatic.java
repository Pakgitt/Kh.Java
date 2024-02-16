package mStatic;

public class RunStatic {
	public static void method() {

		System.out.println("그냥 static 클래스 메소드");
	}

	public static void main(String[] args) {
		// 여기 main 첫머리에서 static 에 값확인 가능
		// System.out.println(BankAccount.amount);
		System.out.println(BankAccount.getAmount());

		String owner;
		String cid;
		String password;

		System.out.println("고객님 반갑습니다.");
		System.out.println("성함과 주민번호를 주시면 계좌 계설해드릴께요.");

		BankAccount jw = new BankAccount("jw", "222222", "1234");
		BankAccount yi = new BankAccount("yi", "111111", "2323");
		BankAccount cw = new BankAccount("cw", "33333", "5555");
		System.out.println(BankAccount.getAmount());
		BankAccount cw2 = new BankAccount("cw2", "33333", "5555");
		BankAccount cw3 = new BankAccount("cw3", "33333", "5555");
		BankAccount cw4 = new BankAccount("cw4", "33333", "5555");
		// ------

		jw.deposit(1000);
		yi.deposit(50000);

		System.out.println(jw.getBalance()); // 1000
		System.out.println(cw.getBalance());

		jw.setAmount(1);
		yi.setAmount(100);
		BankAccount.setAmount(300);
		System.out.println(jw.getAmount());
		System.out.println(yi.getAmount());
		System.out.println(cw.getAmount());

	}
}
