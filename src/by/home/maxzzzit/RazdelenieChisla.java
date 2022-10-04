package by.home.maxzzzit;

import java.util.Scanner;

public class RazdelenieChisla {

	public static void main(String[] args) {
		int chislo, sot, des, ed;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите число меньше 1000, для выхода нажмите 0: ");
		boolean loop = true;
		while (loop) {
			chislo = scn.nextInt();
			if (chislo == 0) {
				loop = false;
				break;
			} else if (chislo > 1 && chislo < 10) {
				System.out.println("В числе " + chislo + " - " + chislo + " единиц");
			} else if (chislo >= 10 && chislo < 100) {
				des = chislo / 10;
				ed = chislo % 10;
				System.out.println("В числе " + chislo + " - " + des + " десятков " + " и " + ed + " единиц");
			} else if (chislo >= 100 && chislo < 1000) {
				sot = chislo / 100;
				des = (chislo / 10) % 10;
				ed = chislo % 10;
				System.out.println(
						"В числе " + chislo + " - " + sot + " сотен " + des + " десятков " + " и " + ed + " единиц");
			} else
				System.out.println("Введите число больше 0 но меньше 1000 !");
		}
	}
}
