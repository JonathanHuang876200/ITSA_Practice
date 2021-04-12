
import java.util.*;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		while (sc.hasNext()) {
			int dataNum = sc.nextInt();
//			String dataStr = String.valueOf(dataNum);
//			System.out.println("Height: " + dataStr);
			int genderNum = sc.nextInt();
			System.out.println("Gender: " + genderNum);
			/* 男生體重=1, 女生體重=2 */
			if (genderNum == 1) {
				weight = (dataNum - 80) * 0.7;
				System.out.println("Man: " + weight);
			} else {
				weight = (dataNum - 70) * 0.6;
				System.out.println("Woman: " + weight);
			}
		}
		System.out.println("Out of loop");
	}

}
