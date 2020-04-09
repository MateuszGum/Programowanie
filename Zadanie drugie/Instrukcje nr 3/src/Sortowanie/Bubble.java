package Sortowanie;

public class Bubble {

	int ile;

	public int[] sort(int[] tab) {

		int dlugosc = tab.length;
		int it = 0;
		while (it < dlugosc - 1) {
			for (int j = 0; j < dlugosc - 1; j++) {
				if (tab[j] > tab[j + 1]) {
					swap(tab, j, j + 1);

				}

			}
			it++;

		}
		ile = it;
		return tab;
	}

	private void swap(int[] tab, int a, int b) {
		int temp = tab[a];
		tab[a] = tab[b];
		tab[b] = temp;
	}

	public void wyswietl(int[] tab) {
		int w = tab.length;
		for (int i = 0; i < w; i++) {
			System.out.println(tab[i]);

		}
	}

	public double step_counting() {

		System.out.println("liczba porównañ wynosi " + ile);

		return ile;
	}
}
