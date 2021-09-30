import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		NommeLesJoueurs player = new NommeLesJoueurs();
		player.player1();
		Scanner scann1 = new Scanner(System.in);
		String joueur1 = scann1.nextLine();
		player.welcome();

		player.player2();
		Scanner scann2 = new Scanner(System.in);
		String joueur2 = scann2.nextLine();

		player.welcome();
		// player.welcome(nom du joueur); ?????????

		Tableau tableauPourJouer = new Tableau();
		// affichage du plateau de jeu
		tableauPourJouer.tableauDeJeu();

	}; // fin main

}// fin Main