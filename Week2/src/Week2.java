import java.util.Scanner;

public class Week2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(String.format("b %s", Integer.toBinaryString(num)));
		System.out.println(String.format("o %s", Integer.toOctalString(num)));
		System.out.println(String.format("h %s", Integer.toHexString(num)));
	}
}
