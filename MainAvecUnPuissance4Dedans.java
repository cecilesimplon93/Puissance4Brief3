import java.util.Arrays;
import java.util.Scanner;

//ci-dessus, les trucs que java doit importer pour faire fonctionner cette chose

//pour le meilleur et pour le pire... c'est parti.......
//mais vraiment, je suis désolée pour tout ce qui va suivre....

public class MainAvecUnPuissance4Dedans {
// ici je declare toutes mes variables
// et je les déclare ici pour pouvoir y accéder de partout depuis cette Main

	private static final String joueur1 = null;
	private static final String joueur2 = null;
	static int lig = 7; // lignes du tableau
	static int col = 8; // colonnes du tableau
	static int tableau[][] = new int[lig][col]; // un très très beau tableau à 2 dimensions (soyons fous)
	 // String joueur1 ; // je vous laisse deviner
	// String joueur2 ; // je sais, le suspens est insoutenable....
	// mais en vrai, on ne les fera rentrer que plus tard
	static int tourDeJeu = 4; // pour ne pas se battre pour savoir à qui c'est de jouer
	static boolean victoire = false; // aucune idée, mais ça faisait joli ! ha si, ça me revient, c'est la condition
								static // de victoire ! (si si !!!)
// je crois n'avoir rien oublié
// sinon c'est pas grave, je reviendrai...
	String gagnant;
// je t'avais dit que je reviendrais....
	static int jeton;// les jetons des joueurs seront des "0" et des "8"
	static String notreGagnant = "nobody"; // car je ne suis pas dev
	static int choix;
	static int rangee;

	// les choses sérieuses commencent ici (enfin, je crois)-----------
	public static void main(String[] args) {
		// TODO Auto-generated method stub => merci l'ordi pour ton commentaire tout nul

		// là je crée un machin trop classe pour pouvoir appeler les fonctions présentes dans la dite main
		MainAvecUnPuissance4Dedans cesttroplaclasse = new MainAvecUnPuissance4Dedans();

// on va commencer par se présenter, ça sera tout de suite plus sympa
		System.out.println("Joueur 1, quel est ton prénom ?");
		// j'ai pas dit "s'il-te-plait", je sais...
		Scanner scann1 = new Scanner(System.in);
		String joueur1 = scann1.nextLine();
		System.out.println("Salut beau gosse");
		System.out.println("Et toi, c'est quoi ton petit nom ?");
		Scanner scann2 = new Scanner(System.in);
		String joueur2 = scann1.nextLine();
		System.out.println("Mouais, pas mal ton prénom...");
		System.out.println("Allez go ! " + joueur1 + " vs " + joueur2 + " !");
		// et pour que les choses soient bien claires entre nous :
		System.out.println("PS : Merci de bien répondre aux questions, sinon ça plante");

//on va monter et initialiser le tableau
		for (int i = 0; i < lig; i++) {
			for (int j = 0; j < 8; j++) {
				tableau[i][j] = 1;
				// pour numéroter les colonnes sur la ligne du bas
				for (int z = 0; z < 8; z++) {
					tableau[6][z] = z;
				}
				;
				;
			}
			;
		}
		;
// affichage du tableau au début du jeu :
		cesttroplaclasse.afficheLeTableau();
		
		
		
		
//----------------------------------------------------------------------
//----------------------------------------------------------------------
//----------------------------------------------------------------------
//----------------------------------------------------------------------
// ----------------------------DEBUT DU JEU ----------------------------
	
// while = niveau 1
		
		while (victoire!=true) {
		
		
		// c'est à qui de jouer svp ?
			if(tourDeJeu % 2 ==0) { System.out.println("\n\n      "+ joueur1 +", tu veux jouer dans quelle colonne ?"); 
			jeton=0; gagnant=joueur1;
			}
			else  { System.out.println("\n\n     "+joueur2 +", dans quelle colonne veux-tu jouer ?");
			jeton=8;gagnant=joueur2;}
			
			tourDeJeu++;// et on incrémente en prévision du tour suivant
			
		// tu joues quoi ?
		
			Scanner scann3= new Scanner(System.in);
			choix = scann3.nextInt();
			System.out.println (gagnant +" a joué dans la colonne "+choix);
			// implémentation sur la bonne rangée dans la colonne
			
			
		while ((tableau[rangee][choix]) == 0 || (tableau[rangee][choix]) == 8) {rangee++;};
		
		tableau[rangee][choix]= jeton;
		cesttroplaclasse.afficheLeTableau();
		
			// puis réaffichage du tableau
			
			//analyse en cours.....
		
		
		
		victoire= false
				;// en provisoire
		} //fin du while initial qui est "condition de victoire" à mettre à true pour sortir
//-------------------------FIN DU JEU----------------------------------------
//----------------------------------------------------------------------
//----------------------------------------------------------------------	
//----------------------------------------------------------------------
//----------------------------------------------------------------------
		
		// les félicitations qui s'imposent à la sortie du grand while initial
		cesttroplaclasse.grandeVictoire();
		
		
	}// fin du  main-----------------------------------------------------

	// ci-dessous, les public void ....(), des fonctions dans des classes, ça s'appelle des "méthodes"

	public void afficheLeTableau() {
		System.out.println(" \n \n                ");
		for (int m = 0; m < 7; m++) {
			System.out.println("\n");
			for (int g = 1; g < 8; g++) {
				System.out.print("     " + tableau[m][g] + "    ");
			}
			;
		}
		;
	}

	public void grandeVictoire() {
		System.out.println(" \n \n                  Félicitations " + gagnant + " ! Tu as gagné !!!");
	}

	/*public void aQuiDeJouer() {
		if (tourDeJeu % 2 == 0) {
			System.out.println(joueur1 + ", Choisis ta colonne");
			ping = 0;
		}
		if (tourDeJeu % 2 != 0) {
			System.out.println(joueur2 + " Dans quelle colonne veux-tu jouer ?");
			ping = 8;
		} else {
			System.out.println("Huston, on a un probleme !!!");
		}
		;
	}*/

}// fin de la grande classe
