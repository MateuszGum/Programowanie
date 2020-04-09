package Sortowanie;

public class Bucket implements Sortable {

	int[] tablica;

	public int[] sort(int[] tab) {

		int dlugosc = tab.length;
		int max = tab[0];
		for (int i = 0; i < dlugosc; i++) {
			if (tab[i] > max)
				max = tab[i];
		}
		System.out.println("max wartoœæ: " + max);

		int[] kubelki = new int[max + 1];
		for (int i = 0; i < max + 1; i++) {
			kubelki[i] = 0;
		}
		// na tym etapie masz juz wyzerowan¹ tablice kubelki

		for (int i = 0; i < dlugosc; i++) {
			
			kubelki[ tab[i]]++;

		}
				

		return kubelki;
	}
	public void wyswietl(int[] tab) {
		int w = tab.length;
		for (int i = 0; i < w; i++) {
			for(int j=0; j<tab[i];j++) {
				System.out.println(i);
			}

		}
	}

	public double step_counting(int[] tab) {

		System.out.println("sortowanie kube³kowe dzia³a liniowo wiêc liczba porównañ bêdzie równa liczbie podanych liczb czyli: ");
		int dlugosc = tab.length;
		
		System.out.println(dlugosc);
		System.out.println("poniewa¿ ka¿d¹ liczbe musi porównaæ z odpowiednim kube³kiem");
		return dlugosc;
	}

}
