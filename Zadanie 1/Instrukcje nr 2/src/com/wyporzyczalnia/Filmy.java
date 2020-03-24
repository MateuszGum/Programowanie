package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class Filmy extends Zbiory {
	private int dlugosc;

	public int getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}

	public void wyswietl() {
		System.out.println("Flim ");
		System.out.println("numer " + numer);
		System.out.println("nazwa " + nazwa);
		System.out.println("autor " + autor);
		System.out.println("wydawnictwo " + wydawnictwo);
		System.out.println("wartoœæ " + cena);
		System.out.println("d³ugosc " + dlugosc);
		System.out.println("--------------------");
	}
}
