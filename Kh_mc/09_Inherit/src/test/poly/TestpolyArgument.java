package test.poly;

public class TestpolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Chair());
		b.buy(new Desk());
		b.buy(new Light());

	}
}

class Furniture {
	int price; // 제품가격

	public Furniture(int price) {
		this.price = price;
	}

}

class Light extends Furniture {
	public Light() {
		super(100); // 부모 클래스의 생성자 호출

	}

	@Override
	public String toString() {
		return "Light";
	}

	public void LightMethod() {
		System.out.println("배송불가");
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
	}

	@Override
	public String toString() {
		return "Chair";
	}

	public void chairMethod() {
		System.out.println("배송해드림");
	}
}

class Desk extends Furniture {
	public Desk() {
		super(200);
	}

	@Override
	public String toString() {
		return "Desk";
	}

	public void deskMethod() {
		System.out.println("배송해드림");
	}
}

class Buyer {
	private int money = 500;

	public void buy(Furniture f) {
		if (money < f.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= f.price;
		System.out.println(f + " 구매성공! 잔액: " + money + " 만원");
		// pseudo - code 슈도 코드
//		if (f == desk) {
//			deskMethod();
//		}
//		if (f == chair) {
//			chairMethod();
//		}

		if (f instanceof Desk) {
			((Desk) f).deskMethod();

		}
		if (f instanceof Chair) {
			((Chair) f).chairMethod();

		}

		if (f instanceof Light) {
			((Light) f).LightMethod();
		}
	}

}
