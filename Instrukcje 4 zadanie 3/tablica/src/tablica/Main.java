package tablica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = new int [200];
		for(int i=0;i<200;i++){
			tab[i]=0;
		}
		
		System.out.println("podaj kt�ry element tablicy chcesz wy�wietli�");
		
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
			System.out.println("b��d formatu");
		}
	}
}
