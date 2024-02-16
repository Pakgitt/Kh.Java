package inherit.run;

import inheritsample.Person;
import inheritsample.Professor;
import inheritsample.Student;

public class TestAbstract {
	public static void main(String[] args) {
		Student s1 = new Student("자바");
		s1.out();
		System.out.println();
		Student s2 = new Student("자바", "박세혁");
		s2.out();
		System.out.println();
//		Professor p1 = new Professor("컴공");
//		p1.out();
		System.out.println();
		Professor p2 = new Professor("컴공", "이제이");
		p2.out();
		System.out.println();

		Person person1 = new Person() {
			@Override
			public void out() {
				// TODO Auto-generated method stub
				System.out.println("abstract class일 경우 new () 하면 지금처럼 ");
			}
		};

		person1.out();

	}
}
