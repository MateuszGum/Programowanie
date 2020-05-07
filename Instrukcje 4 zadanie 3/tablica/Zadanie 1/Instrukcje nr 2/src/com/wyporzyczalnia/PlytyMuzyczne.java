package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class PlytyMuzyczne  {
	private int ile_utworow;
	private Zbiory zbiory;
	

	public  PlytyMuzyczne() {
		this.zbiory = new Zbiory();
		zbiory.setAutor("autor");
		zbiory.setCena(25);
		zbiory.setNazwa("ballada");
		zbiory.setNumer(659);
		zbiory.setWydawnictwo("helion");
		ile_utworow = 230;
	}
	
	public int getIle_utworow() {
		return ile_utworow;
	}

	public void setIle_utworow(int ile_utworow) {
		this.ile_utworow = ile_utworow;
	}

	public void wyswietl() {
		System.out.println("P³yta Muzyczna ");
		System.out.println("numer " + zbiory.getNumer());
		System.out.println("nazwa " + zbiory.getNazwa());
		System.out.println("autor " + zbiory.getAutor());
		System.out.println("wydawnictwo " + zbiory.getWydawnictwo());
		System.out.println("wartoœæ " + zbiory.getCena());
		System.out.println("liczba utworów " + ile_utworow);
		System.out.println("--------------------");
	}

	
}
