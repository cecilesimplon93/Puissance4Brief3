import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*	// appelle le premier joueur
		NommeLesJoueurs player = new NommeLesJoueurs();
		player.player1();
		Scanner scann1 = new Scanner(System.in);
		String joueur1 = scann1.nextLine();
		player.welcome(joueur1);
		// appelle le second joueur
		player.player2();
		Scanner scann2 = new Scanner(System.in);
		String joueur2 = scann2.nextLine();
		player.welcome(joueur2); */

		 Tableau tableauPourJouer = new Tableau();
		 
		 //initialise le tableau de jeu
		 tableauPourJouer.initialiseLeTableau();
		 
		 
		// affichage du plateau de jeu
		tableauPourJouer.tableauDeJeu();
		
		
	

	}; // fin main

}// fin Main