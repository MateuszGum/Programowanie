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
		System.out.println("P�yta Muzyczna ");
		System.out.println("numer " + numer);
		System.out.println("nazwa " + nazwa);
		System.out.println("autor " + autor);
		System.out.println("wydawnictwo " + wydawnictwo);
		System.out.println("warto�� " + cena);
		System.out.println("liczba utwor�w " + ile_utworow);
		System.out.println("--------------------");
	}
}
