import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("A : ");
		int a = sc.nextInt();
		System.out.println("B : ");
		int b = sc.nextInt();

		sc.close();

		System.out.println(a - b);
	}
}
