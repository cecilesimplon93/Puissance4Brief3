import java.util.Scanner;


public class Reussite {
	int tourDeJeu=0;
	// ping sera le nombre qui servira de jeton (0 ou 8)
	int ping;
	// appel du joueur et choix du visuel du jeton qui sera pose (8 ou 0)
	int choix;
	
	public void aQuiDeJouer() {
		System.out.println(" \n \n");
		System.out.println(tourDeJeu +"  "+  ping);
		 
		if(tourDeJeu % 2 ==0) { System.out.println("Joueur 1, quelle colonne ?"); 
		ping=0;
		}
		if(tourDeJeu %2 != 0) { System.out.println("Joueur 2, quelle colonne ?");
		ping=8;}
		else {System.out.println ("Huston, on a un probleme !!!");}
		//fin à qui de jouer ? + saisie
		
		Scanner scann4= new Scanner(System.in);
		choix = scann4.nextInt();
		
		System.out.println ("Tu as choisi la colonne "+choix);
		//inserer nom des joueurs
	tourDeJeu++;
	System.out.println("test /tour de jeu" + tourDeJeu +"  ");
	};

public void tourDeJeu() {
	
	//implémenter le plateau
	System.out.println("test/début tourDeJeux()");
	System.out.println("Joueur a choisi colonne "+choix);
	tourDeJeu++; 
	System.out.println("test / tour de jeu à "+ tourDeJeu);
	System.out.println(plateau[4][2]);
	
	/*while (plateau[lig][choix]!=1) { plateau[lig++][choix] };
	plateau[lig][choix]=ping;*/
	}
	
	
	
	
	
	 }


	/* 
	 * public void implementationColonne() {// comment savoir si la place est libre,
	 * et sinon?
	 * 
	 * // o� va arriver le jeton 8 ou 0 // choix de la colonne, choisir l'indice
	 * libre // nouvel affichage du tableau //je recup�re l'indice d�finitif, je
	 * vais regarder autour
	 * 
	 
	 * public class verifications { // si 4 cases horizontales � partir du point P
	 * et sur sa droite? if
	 * (plateau[lig][col]==plateau[lig][col+1]==plateau[lig][col+2]==plateau[lig][
	 * col+3]) { //R�ussite} System.out.println("test r�ussite ok");
	 * jeuEnCours.victoire(); } else { // si aucune condition remplie => pas de
	 * victoire, on recommence} }
	 * 
	 * } //fin des verifications
	 * 
	 * 
	 * public void victoire(nomGagnant) {System.out.println( "Congratulations "+
	 * nomGagnant +" !!!" ); // refaire pareil en insérant le nom du gagnant };
	 */

};

