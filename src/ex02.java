import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println(String.format("O número informado foi [%s]", num));
			

	}

}
