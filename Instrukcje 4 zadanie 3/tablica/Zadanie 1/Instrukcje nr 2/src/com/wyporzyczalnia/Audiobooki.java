package com.wyporzyczalnia;

import com.wyporzyczalnia.Zbiory;

public class Audiobooki extends Zbiory {
	private int dlugosc;
	private Zbiory zbiory;

	public  Audiobooki() {
		this.zbiory = new Zbiory();
		zbiory.setAutor("autor");
		zbiory.setCena(20);
		zbiory.setNazwa("ballada");
		zbiory.setNumer(789);
		zbiory.setWydawnictwo("helion");
		dlugosc = 230;
	}
	
	public int getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}

	public void wyswietl() {
		System.out.println("Audiobook ");
		System.out.println("numer " + zbiory.getNumer());
		System.out.println("nazwa " + zbiory.getNazwa());
		System.out.println("autor " + zbiory.getAutor());
		System.out.println("wydawnictwo " + zbiory.getWydawnictwo());
		System.out.println("wartoœæ " + zbiory.getCena());
		System.out.println("d³ugosc " + dlugosc);
		System.out.println("--------------------");
	}
}
