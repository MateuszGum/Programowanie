package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class Ksiazki  {
	private Zbiory zbiory;
	private int ilosc_stron;

	void Ksiazki() {
		this.zbiory = new Zbiory();
		zbiory.setAutor("autor");
		zbiory.setCena(20);
		zbiory.setNazwa("ballada");
		zbiory.setNumer(789);
		zbiory.setWydawnictwo("helion");
		ilosc_stron = 230;
	}
	
	public int getIlosc_stron() {
		return ilosc_stron;
	}

	public void setIlosc_stron(int ilosc_stron) {
		this.ilosc_stron = ilosc_stron;
	}

	public void wyswietl() {
		System.out.println("Ksi¹¿ka ");
		System.out.println("numer " + getNumer());
		System.out.println("nazwa " + zbiory.getNazwa());
		System.out.println("autor " + zbiory.getAutor());
		System.out.println("wydawnictwo " + zbiory.getWydawnictwo());
		System.out.println("wartoœæ " + zbiory.getCena());
		System.out.println("liczba stron " + ilosc_stron);
		System.out.println("--------------------");
	}
	public int getNumer() {
		
		return zbiory.getNumer();
	
	}
}
