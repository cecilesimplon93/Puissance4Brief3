
public class Reussite {
	Reussite jeuEnCours = new Reussite();
	
	
	// � qui de jouer ? appel du joueur et choix du visuel du jeton qui sera pos� (8 ou 0)
	public void aQuiDeJouer {
	int tourDeJeu=0;
	int ping; // ping sera le nombre envoy� pour servir de jeton (0 ou 8)
	if (tourDeJeu % 2 != 0) { System.out.println("test / � toi de jouer, joueur 1"); 
	ping=0;
	}
	//System.out.println(joueur1 + ", dans quelle colonne veux-tu jouer ?")
	else {System.out.println(Systemn.out.println("test / � joueur 2 de choisir colonne");
	ping=8;}
	tourDeJeu++;
	//impression du texte et reception de la saisie
	
	}
	
	public void implementationColonne {// comment savoir si la place est libre, et sinon?
		
	}
	
	// o� va arriver le jeton 8 ou 0
	// choix de la colonne, choisir l'indice libre
	// nouvel affichage du tableau
	//je recup�re l'indice d�finitif, je vais regarder autour
	
	
	public class verifications {
	// si 4 cases horizontales � partir du point P et sur sa droite?
	if (plateau[lig][col]==plateau[lig][col+1]==plateau[lig][col+2]==plateau[lig][col+3]) { //R�ussite} 
		System.out.println("test r�ussite ok");
		jeuEnCours.victoire();
		}
	else { // si aucune condition remplie => pas de victoire, on recommence}
	}
	
	} //fin des verifications
	
	
	public void victoire {
		
	}
		System.out.println ("VICTOIRE !!!!!");
		// System.out.printlnt(Nomdujoueur + " est le gagnant.")
		// faire un exit
	}
	
}
