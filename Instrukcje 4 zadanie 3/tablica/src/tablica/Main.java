package tablica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = new int [200];
		for(int i=0;i<200;i++){
			tab[i]=0;
		}
		
		System.out.println("podaj który element tablicy chcesz wyœwietliæ");
		
		try {
				Scanner scan = new Scanner(System.in);
		int nowy = Integer.parseInt(scan.next());
		
		
		try {
			System.out.println(tab[nowy]);
			
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("tablica nie ma takiego elementu");
		}
		}
		catch(NumberFormatException d) {
			System.out.println("b³¹d formatu");
		}
	}
}
