package T3;

public class Calculation {

	public static double Calculate(double start, double finish, double step) {
		double result=0;
		for (double i = start; i <= finish; i += step) {
			result = Math.tan(i);
			System.out.println("Argument="+i + " Result=" + result+ " Step=" + step);
		}
		return result;
	}
}
