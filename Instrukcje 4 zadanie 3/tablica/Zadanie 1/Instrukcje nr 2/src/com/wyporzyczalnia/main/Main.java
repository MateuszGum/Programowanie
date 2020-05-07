package com.wyporzyczalnia.main;

import com.wyporzyczalnia.aktorzy.Uzytkownik;
import com.wyporzyczalnia.Ksiazki;
import com.wyporzyczalnia.PlytyMuzyczne;
import com.wyporzyczalnia.Filmy;

import java.util.Scanner;

import com.wyporzyczalnia.Audiobooki;
import com.wyporzyczalnia.Ebooki;

public class Main {
	public static void main(String[] args) {

		Ksiazki pierwszak = new Ksiazki();
		

		PlytyMuzyczne pierwszap = new PlytyMuzyczne();
		

		Filmy pierwszaf = new Filmy();
	

		Audiobooki pierwszaa = new Audiobooki();
	

		Ebooki pierwszae = new Ebooki();
		

		Uzytkownik user[] = new Uzytkownik[4];

		int i = 0;
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("co chcesz zrobic?");
			System.out.println("zarejestrowac sie(1), zalogowac sie(2), wylaczyc program(3)");
			int decyzja = Integer.parseInt(scan.nextLine());
			switch (decyzja) {
			case 1: {
				if (i < 4) {
					System.out.println("Rejestracja");
					user[i] = new Uzytkownik();
					System.out.println("wybierz swój login (kombinacja cyfr)");
					int login = Integer.parseInt(scan.nextLine());
					user[i].setLogin(login);
					i++;
				} else {
					System.out.println("Nie mozna zarejestrowac wiecej uzytkownikow");
				}
				break;
			}

			case 2: {
				System.out.println("podaj login");
				int login = Integer.parseInt(scan.nextLine());

				if (login == user[0].getLogin()) {

					System.out.println("co chcesz zrobic?");
					System.out.println(
							"wypozyczyc (1), oddac(2), sprawdzic dane osobowe(3), sprawdzic stan konta(4), wylogowac sie(5)");
					int wybor = Integer.parseInt(scan.nextLine());
					switch (wybor) {
					case 1: {
						pierwszak.wyswietl();
						pierwszap.wyswietl();
						pierwszaf.wyswietl();
						pierwszaa.wyswietl();
						pierwszae.wyswietl();
						user[0].wypozycz();
						break;
					}
					case 2: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[0].oddaj_dziela(day, month, year);
						break;

					}
					case 3: {
						user[0].wyswietl();
						break;
					}
					case 4: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[0].informacje(day, month, year);
						break;
					}
					case 5: {
						break;
					}

					}

				}

				
				else if (login == user[1].getLogin()) {

					System.out.println("co chcesz zrobic?");
					System.out.println(
							"wypozyczyc (1), oddac(2), sprawdzic dane osobowe(3), sprawdzic stan konta(4), wylogowac sie(5)");
					int wybor = Integer.parseInt(scan.nextLine());
					switch (wybor) {
					case 1: {
						user[1].wypozycz();
						break;
					}
					case 2: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[1].oddaj_dziela(day, month, year);
						break;

					}
					case 3: {
						user[1].wyswietl();
						break;
					}
					case 4: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[1].informacje(day, month, year);
						break;
					}
					case 5: {
						break;
					}

					}

				}

				
				else if (login == user[2].getLogin()) {

					System.out.println("co chcesz zrobic?");
					System.out.println(
							"wypozyczyc (1), oddac(2), sprawdzic dane osobowe(3), sprawdzic stan konta(4), wylogowac sie(5)");
					int wybor = Integer.parseInt(scan.nextLine());
					switch (wybor) {
					case 1: {
						user[2].wypozycz();
						break;
					}
					case 2: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[2].oddaj_dziela(day, month, year);
						break;

					}
					case 3: {
						user[2].wyswietl();
						break;
					}
					case 4: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[2].informacje(day, month, year);
						break;
					}
					case 5: {
						break;
					}

					}

				}
				
				else if (login == user[3].getLogin()) {

					System.out.println("co chcesz zrobic?");
					System.out.println(
							"wypozyczyc (1), oddac(2), sprawdzic dane osobowe(3), sprawdzic stan konta(4), wylogowac sie(5)");
					int wybor = Integer.parseInt(scan.nextLine());
					switch (wybor) {
					case 1: {
						user[3].wypozycz();
						break;
					}
					case 2: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[3].oddaj_dziela(day, month, year);
						break;

					}
					case 3: {
						user[3].wyswietl();
						break;
					}
					case 4: {
						System.out.println("podaj dzisiejsz¹ date: dzieñ (cyfr¹)");
						int day = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: mieis¹c (cyfr¹)");
						int month = Integer.parseInt(scan.nextLine());
						System.out.println("podaj dzisiejsz¹ date: rok (cyfr¹)");
						int year = Integer.parseInt(scan.nextLine());
						user[3].informacje(day, month, year);
						break;
					}
					case 5: {
						break;
					}

					}

				}
				
				
				break;
			}
			case 3: {
				java.lang.System.exit(0);
			}
			}
		}
	}
}
