package Sortowanie;
import Sortowanie.Bucket;
import Sortowanie.Bubble;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		
		
		Random random = new Random();
		
		int[] arr = new int[200];
		
		for(int i = 0; i<200; i++) {
			int b = random.nextInt(500);
			arr[i] = b;
			System.out.println(arr[i]);
		}
	while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("co chcesz zrobi� z tymi liczbami");
		System.out.println("posortowa� Kubelkowo (1)  posortowa� B�belkowo (2)");
		System.out.println("wyj�� (3)");
		int decyzja = Integer.parseInt(scan.nextLine());
		switch (decyzja) {
		case 1:{
			Bucket cos = new Bucket();
			
			cos.wyswietl(cos.sort(arr));
			cos.step_counting(arr);
			System.out.println("wy��czam program");
			java.lang.System.exit(0);
		}
		case 2:{
			Bubble cos = new Bubble();
			
			cos.wyswietl(cos.sort(arr));
			cos.step_counting();
			System.out.println("wy��czam program");
			java.lang.System.exit(0);
		}
		case 3:{
			System.out.println("wy��czam program");
			java.lang.System.exit(0);
		}
		
		}
	}
		
		
	}
	
	
}
