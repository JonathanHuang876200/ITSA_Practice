import java.util.*;

public class ReturnChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = "500,1,2,3";
		String s = sc.next();
//		System.out.println(s);
		String[] input = s.split(",");
		int money = Integer.parseInt(input[0]);
		int a1 = Integer.parseInt(input[1]);
		int a2 = Integer.parseInt(input[2]);
		int a3 = Integer.parseInt(input[3]);
		int price = (a1 * 15) + (a2 * 20) + (a3 * 30);
		if (money >= price) {
			int change = money - price;
			int oneD = 0, fiveD = 0, fiftyD = 0;
			while (change >= 50) {
				change -= 50;
				fiftyD++;
			}
			while (change >= 5) {
				change -= 5;
				fiveD++;
			}
			while (change >= 1) {
				change -= 1;
				oneD++;
			}
			System.out.println(oneD + "," + fiveD + "," + fiftyD);
		} else {
			System.out.println(0);
		}
	}

}
