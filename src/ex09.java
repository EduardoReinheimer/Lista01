import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a temperatura em Fahrenheit: ");
		double tempFahrenheit = scan.nextDouble();
		scan.close();

		double tempCelsius = ConvertFahrenheitToCelsius(tempFahrenheit);
		
		System.out.println(String.format("A temperatura em graus Celsius: %s", tempCelsius));
	}

	private static double ConvertFahrenheitToCelsius(double tempFahrenheit) {
		return 5 * (tempFahrenheit-32) / 9;
	}

}
