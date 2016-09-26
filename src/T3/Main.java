package T3;


public class Main {

	public static void main(String[] args) throws NumberFormatException {

		if (args.length == 3) {
			String str1 = args[0];
			String str2 = args[1];
			String str3 = args[2];
            //if we get an invalid argument  program throws NumberFormatException
			if (!str1.matches("[-+]?\\d*\\.?\\d+") || !str2.matches("[-+]?\\d*\\.?\\d+")|| !str2.matches("[-+]?\\d*\\.?\\d+")) {
				throw new NumberFormatException();
			} else {
				double a = Double.parseDouble(str1);
				double b = Double.parseDouble(str2);
				double c = Double.parseDouble(str3);
				Calculation.Calculate(a,b,c);
			}
		} else {
			System.out.println("Illegal number of arguments");
		}
	}
}
