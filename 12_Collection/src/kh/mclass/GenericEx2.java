package kh.mclass;

import java.awt.Point;

import javax.management.remote.SubjectDelegationPermission;

public class GenericEx2<T> {

	class point {
		int x;
		int y;

	}

	class ChildPoint extends Point {
		int x;
		int y;
	}

	class Triangle<T extends Point> { // 상위 클래스 제한
		T pos1, pos2, po3;
	}

//	class TriangleEx<T super Point> { // 하위 클래스 제한
//		T pos1, pos2, po3;
//	}

}
