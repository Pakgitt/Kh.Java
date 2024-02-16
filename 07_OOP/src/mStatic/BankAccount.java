package mStatic;

public class BankAccount {
    private static int amount = 5;  // 클래스변수
    private String no; // 멤버변수
    private String password;
    private String owner;
    private String cid;
    private int balance = 0; // 초기값 추가
    
    // public BankAccount() {}  // 기본생성자 생략가능
    
    // 생성자 중복 정의
    public BankAccount(String owner, String cid, String password) {
        this(owner, cid, password, String.valueOf(Math.random()).substring(2));
    }

    // 제한을 있는 생성자
    public BankAccount(String owner, String cid, String password, String no) {
        this.owner = owner;
        this.cid = cid;
        this.password = password;
        
        // 계좌 생성 가능 여부 체크
        if (amount == 0) {
            System.out.println("더 이상 계좌계설이 불가능합니다.");
            return;
        }

        // 계좌 개수 감소
        amount--;

        // 계좌번호 초기화
        this.no = no;
        System.out.printf("");
    }
    
    // 나머지 메서드는 그대로 유지됨

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        BankAccount.amount = amount;
    }

    public String getNo() {
        return no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwner() {
        return owner;
    }

    public String getCid() {
        return cid;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int input) {
        balance += input;
    }

    public void withdraw(int input, String inputPw) {
        if (!checkPw(inputPw)) {
            System.out.println("비밀번호를 다시 입력해주세요");
            return;
        }
        // 경고
        if (balance - input < 0) {
            System.out.println("잔액부족");
            return;
        }
        balance -= input;
        // 경고
    }
    
    public boolean checkPw(String inputPw) {
        if (inputPw.equals(this.password)) {
            return true;
        }
        // else 부분을 삭제하거나 주석 해제해도 됨
        return false;
    }
}
