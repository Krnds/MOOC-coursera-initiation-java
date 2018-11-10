package fr.krnds.locationvelos;

import java.util.Scanner;

public class Velos2 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// variables :
		int heureDebut;
		int heureFin;
		int prix = 0;

		// interface utilisateur :
		System.out.println("Quelle est l'heure de début de location svp ? (un entier): ");
		heureDebut = scanner.nextInt();

		System.out.println("Quelle est l'heure de fin de location svp ? (un entier): ");
		heureFin = scanner.nextInt();

		// conditions initiales :
		if ((heureDebut > 24 || heureDebut < 0) || (heureFin > 24 || heureFin < 0)) {
			System.out.println("Les heures doivent être comprises entre 0 et 24 !\n");
			System.exit(0);
		} else if (heureDebut == heureFin) {
			System.out.println("Bizarre, vous n’avez pas loué votre vélo bien longtemps !\n");
			System.exit(0);
		} else if (heureDebut > heureFin) {
			System.out.println("Bizarre, le début de la location est après la fin...\n");
			System.exit(0);
		}

		// calcul du prix :
		int[] prices = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 };
		// heureDebut = 0;
		// heureFin = 8;
		for (int i = heureDebut; i < heureFin; i++) {
			prix = prix + prices[i];
		}
		System.out.println("Le prix est de " + prix + " euros");
	}

}
