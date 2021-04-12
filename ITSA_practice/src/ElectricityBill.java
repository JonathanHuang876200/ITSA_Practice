import java.text.DecimalFormat;
import java.util.*;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int degree = sc.nextInt();
		double summerRate = 0, nonSummerRate = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		/* 2.10 2.10 */
		if (degree <= 120) {
			summerRate = 2.10;
			nonSummerRate = 2.10;
		}
		/* 3.02 2.68 */
		if ((121 <= degree) && (degree <= 330)) {
			summerRate = 3.02;
			nonSummerRate = 2.68;
		}
		/* 4.39 3.61 */
		if ((331 <= degree) && (degree <= 500)) {
			summerRate = 4.39;
			nonSummerRate = 3.61;
		}
		/* 4.97 4.01 */
		if ((501 <= degree) && (degree <= 700)) {
			summerRate = 4.39;
			nonSummerRate = 3.61;
		}
		/* 5.63 4.50 */
		if ((701 <= degree)) {
			summerRate = 5.63;
			nonSummerRate = 4.50;
		}
		double summerDegree = degree * summerRate;
		double nonSummerDegree = degree * nonSummerRate;
		System.out.println("Summer months:" + summerDegree);
		System.out.println("Non-Summer months:" + nonSummerDegree);

	}
}
