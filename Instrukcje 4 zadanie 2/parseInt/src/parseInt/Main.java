package parseInt;
import java.util.Scanner;
public class Main {

	public static void main(String [] args) {
		while(true) {
			
			try {
			System.out.println("podaj na jaki system chcesz zamieni� znaki (gdzie 2 oznacza dw�jkowy 8 �semkowy itd.)");
			Scanner jakiSystem = new Scanner(System.in);
			int a = Integer.parseInt(jakiSystem.next());
			System.out.println("podaj liczb� do zamiany)");
			Scanner scan = new Scanner(System.in);
			int liczba = Integer.parseInt(scan.next(),a);
			System.out.println("twoja liczba to: " + liczba);
			}
			catch(NumberFormatException d) {
				System.out.println("b��d formatu");
			}
						
			
		}
	}
}
