package kh.mclass;

public class TestSynchronized {
	public static void main(String[] args) {
//		AccountManager t1 = new AccountManager("ATM");
//		Thread t2 = new AccountManager("인터넷 뱅킹");
//		Thread t3 = new AccountManager("모바일 앱");
//
//		t1.start();
//		t2.start();
//		t3.start();

		SharedData sd = new SharedData();
		SynchchangeNumber sch = new SynchchangeNumber(sd);
		System.out.println(sch.getState());
		SynchReadNumber srn = new SynchReadNumber(sd);

		sd.calcNumber();

		sch.start();
		System.out.println(sch.getState());
		srn.start();

	}

}
