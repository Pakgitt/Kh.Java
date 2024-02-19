package inherit.test;

import inherit.sample.Child;
import inherit.sample.Parent;

public class TestBinding {
	public static void main(String[] args) {
		// Bindint 바인딩 (동적 바인딩, 정적 바인딩)
		// 컴파일시에는 정적 바인딩
		// 실행시에는 동적 바인딩
		Parent p = new Parent();
		p.display(); // Parent의 display() 호출

		// Up Casting 
		Parent bind = new Child();
		bind.display(); // Child의 Oveeride된 display() 호출 / Parent의 display() 호출
		((Child)bind).out(); // Down Casting 

		Child c = new Child();

	}
}
