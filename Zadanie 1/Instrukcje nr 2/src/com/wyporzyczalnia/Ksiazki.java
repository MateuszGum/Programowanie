package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class Ksiazki extends Zbiory {

	private int ilosc_stron;

	public int getIlosc_stron() {
		return ilosc_stron;
	}

	public void setIlosc_stron(int ilosc_stron) {
		this.ilosc_stron = ilosc_stron;
	}

	public void wyswietl() {
		System.out.println("Ksi¹¿ka ");
		System.out.println("numer " + numer);
		System.out.println("nazwa " + nazwa);
		System.out.println("autor " + autor);
		System.out.println("wydawnictwo " + wydawnictwo);
		System.out.println("wartoœæ " + cena);
		System.out.println("liczba stron " + ilosc_stron);
		System.out.println("--------------------");
	}
}
