package com.wyporzyczalnia;

import java.util.GregorianCalendar;

public class Zbiory {

	protected int numer;
	protected GregorianCalendar datawyp;
	protected String autor;
	protected String wydawnictwo;
	protected int cena;
	protected String nazwa;

	public int getNumer() {
		return numer;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public GregorianCalendar getDatawyp() {
		return datawyp;
	}

	public void setDatawyp(GregorianCalendar datawyp) {
		this.datawyp = datawyp;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getWydawnictwo() {
		return wydawnictwo;
	}

	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

}
