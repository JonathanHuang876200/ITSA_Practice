
import java.util.*;

public class YearJudge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		boolean flag;
		year = sc.nextInt();
		flag = ((year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0));
		if (flag) {
			System.out.println("Bissextile Year");
		} else {
			System.out.println("Common Year");
		}
	}

}
