package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class Ebooki  {
	private int ilosc_stron;
	private Zbiory zbiory;
	
	public  Ebooki() {
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
		System.out.println("Ebook ");
		System.out.println("numer " + zbiory.getNumer());
		System.out.println("nazwa " + zbiory.getNazwa());
		System.out.println("autor " + zbiory.getAutor());
		System.out.println("wydawnictwo " + zbiory.getWydawnictwo());
		System.out.println("wartoœæ " + zbiory.getCena());
		System.out.println("liczba stron " + ilosc_stron);
		System.out.println("--------------------");
	}
}
