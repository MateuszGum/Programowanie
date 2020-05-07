package com;

public class programy {

	public boolean temp(int temp1, int temp2) {
		if ((temp1 < 100) || (temp2 < 100))
			return true;
		else
			return false;
	}

	public boolean sek123(int[] tab, int dlugosc) {
		for (int j = 0; j < dlugosc - 2; j++)
			if (tab[j] == 1) {
				if (tab[j + 1] == 2) {
					if (tab[j + 2] == 3) {
						return true;
					}
				}
			}
		return false;
	}

	public String polowa(String a) {
		return a.substring(0, a.length() / 2);
	}

	public static int[] odwrot(int[] tab) {
		int[] nowa = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			nowa[i] = tab[tab.length - 1 - i];
		}
		return nowa;
	}

}
