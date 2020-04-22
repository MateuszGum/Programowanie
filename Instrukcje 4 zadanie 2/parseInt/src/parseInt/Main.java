package parseInt;
import java.util.Scanner;
public class Main {

	public static void main(String [] args) {
		while(true) {
			
			try {
			System.out.println("podaj na jaki system chcesz zamieniæ znaki (gdzie 2 oznacza dwójkowy 8 ósemkowy itd.)");
			Scanner jakiSystem = new Scanner(System.in);
			int a = Integer.parseInt(jakiSystem.next());
			System.out.println("podaj liczbê do zamiany)");
			Scanner scan = new Scanner(System.in);
			int liczba = Integer.parseInt(scan.next(),a);
			System.out.println("twoja liczba to: " + liczba);
			}
			catch(NumberFormatException d) {
				System.out.println("b³¹d formatu");
			}
						
			
		}
	}
}
