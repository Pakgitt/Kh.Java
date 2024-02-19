package memo;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MemberHashSet {
	public static void main(String[] args) {

		int n = 5;

		for (int i = -n; i <= n; i++) {
			for (int j = -n; j <= n; j++) {
				if (i * i + j * j <= n * n) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
