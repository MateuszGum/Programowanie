package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class PlytyMuzyczne extends Zbiory {
	private int ile_utworow;

	public int getIle_utworow() {
		return ile_utworow;
	}

	public void setIle_utworow(int ile_utworow) {
		this.ile_utworow = ile_utworow;
	}

	public void wyswietl() {
		System.out.println("P³yta Muzyczna ");
		System.out.println("numer " + numer);
		System.out.println("nazwa " + nazwa);
		System.out.println("autor " + autor);
		System.out.println("wydawnictwo " + wydawnictwo);
		System.out.println("wartoœæ " + cena);
		System.out.println("liczba utworów " + ile_utworow);
		System.out.println("--------------------");
	}
}
