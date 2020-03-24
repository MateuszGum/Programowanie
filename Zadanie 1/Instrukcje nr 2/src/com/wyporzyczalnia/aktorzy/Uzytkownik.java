package com.wyporzyczalnia.aktorzy;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Uzytkownik {
	private int login;
	private String imie;
	private String nazwisko;
	private int data_dolonczenia;
	private int wiek;
	private String adres;
	private int wypozyczone_1;
	private int wypozyczone_2;
	private GregorianCalendar data1;
	private GregorianCalendar data2;
	private GregorianCalendar dataodd1;
	private GregorianCalendar dataodd2;

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public Uzytkownik() {
		Scanner scan = new Scanner(System.in);
		System.out.println("podaj swoje imie");
		this.imie = scan.nextLine();
		System.out.println("podaj swoje nazwisko");
		this.nazwisko = scan.nextLine();
		System.out.println("podaj dzisiejsza date (ddmmrrrr) ");
		this.data_dolonczenia = Integer.parseInt(scan.nextLine());
		System.out.println("podaj sw�j wiek");
		this.wiek = Integer.parseInt(scan.nextLine());
		System.out.println("podaj adres zamieszkania ");
		this.adres = scan.nextLine();
		wypozyczone_1 = 0;
		wypozyczone_2 = 0;

	}

	public void wyswietl() {
		System.out.println(imie);
		System.out.println(nazwisko);
		System.out.println(data_dolonczenia);
		System.out.println(wiek);
		System.out.println(adres);
	}

	public void wypozycz() {
		if (wypozyczone_1 == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("podaj numer dzie�a kt�re wypo�yczasz");
			String numer_dziela = scan.nextLine();
			wypozyczone_1 = Integer.parseInt(numer_dziela);

			System.out.println("podaj dzisiejsz� date dzien (cyfr�)");
			String data_dzien = scan.nextLine();
			int dzien = Integer.parseInt(data_dzien);
			System.out.println("podaj dzisiejsz� date miesiac (cyfr�)");
			String data_miesiac = scan.nextLine();
			int miesiac = Integer.parseInt(data_miesiac);
			miesiac = miesiac - 1;
			System.out.println("podaj dzisiejsz� date rok (cyfr�)");
			String data_rok = scan.nextLine();
			int rok = Integer.parseInt(data_rok);
			data1 = new GregorianCalendar(rok, miesiac, dzien);
			dataodd1 = new GregorianCalendar(rok, miesiac, dzien);
			dataodd1.add(Calendar.MONTH, 2);

		} else if (wypozyczone_2 == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("podaj numer dzie�a kt�re wypo�yczasz");
			String numer_dziela = scan.nextLine();
			wypozyczone_2 = Integer.parseInt(numer_dziela);

			System.out.println("podaj dzisiejsz� date dzien (cyfr�)");
			String data_dzien = scan.nextLine();
			int dzien = Integer.parseInt(data_dzien);
			System.out.println("podaj dzisiejsz� date miesiac (cyfr�)");
			String data_miesiac = scan.nextLine();
			int miesiac = Integer.parseInt(data_miesiac);
			miesiac = miesiac - 1;
			System.out.println("podaj dzisiejsz� date rok (cyfr�)");
			String data_rok = scan.nextLine();
			int rok = Integer.parseInt(data_rok);
			data2 = new GregorianCalendar(rok, miesiac, dzien);
			dataodd2 = new GregorianCalendar(rok, miesiac, dzien);
			dataodd2.add(Calendar.MONTH, 2);

		} else {
			System.out.println("nie mo�esz wypo�yczy� wi�cej dzie�, oddaj poprzednio wypo�yczone dzie�a.");
		}

	}

	public void oddaj_dziela(int dzisiaj_dzien, int dzisiaj_miesiac, int dzisiaj_rok) {

		dzisiaj_miesiac = dzisiaj_miesiac - 1;
		GregorianCalendar data = new GregorianCalendar(dzisiaj_rok, dzisiaj_miesiac, dzisiaj_dzien);

		if (wypozyczone_1 != 0 || wypozyczone_2 != 0) {

			if (wypozyczone_1 != 0) {
				if (data.after(dataodd1)) {
					int kara = 20;
					System.out.println("musisz zap�acic kare w wysoko�ci..." + kara + "z� za ");

				}
				Scanner scan = new Scanner(System.in);
				System.out.println("wypozyczone dzielo nr:  " + wypozyczone_1 + "  czy chcesz je odda�? tak(1) nie(2)");
				String oddaj = scan.nextLine();
				if (Integer.parseInt(oddaj) == 1) {
					wypozyczone_1 = 0;
				}
			}
			if (wypozyczone_2 != 0) {
				if (data.after(dataodd2)) {
					int kara = 20;
					System.out.println("musisz zap�acic kare w wysoko�ci..." + kara + "z� za ");

				}
				Scanner scan = new Scanner(System.in);
				System.out.println("wypozyczone dzielo nr:  " + wypozyczone_2 + "  czy chcesz je odda� tak(1) nie(2)");
				String oddaj = scan.nextLine();
				if (Integer.parseInt(oddaj) == 1) {
					wypozyczone_2 = 0;
				}
			}

		} else if (wypozyczone_1 == 0 && wypozyczone_2 == 0) {
			System.out.println("nic nie wypozyczy�e�, nie masz czego odda�");

		}
	}

	public void informacje(int dzisiaj_dzien, int dzisiaj_miesiac, int dzisiaj_rok) {

		dzisiaj_miesiac = dzisiaj_miesiac - 1;

		GregorianCalendar data = new GregorianCalendar(dzisiaj_rok, dzisiaj_miesiac, dzisiaj_dzien);

		if (wypozyczone_1 == 0 && wypozyczone_2 == 0) {
			System.out.println("nic nie wypozyczy�e�, nie musisz p�acic kary");

		}
		if (wypozyczone_1 != 0) {
			System.out.println("wypozyczono dzielo nr:  " + wypozyczone_1);

		}
		if (wypozyczone_2 != 0) {
			System.out.println("wypozyczono dzielo nr:  " + wypozyczone_2);

		}

		if (data.after(dataodd1)) {
			int kara = 20;
			System.out.println("musisz zap�acic kare w wysoko�ci..." + kara + "z� za wypo�yczone dzielo o numerze "
					+ wypozyczone_1);

		}
		if (data.after(dataodd2)) {
			int kara = 20;
			System.out.println("musisz zap�acic kare w wysoko�ci..." + kara + "z� za wypo�yczone dzielo o numerze "
					+ wypozyczone_2);

		}

	}
}
