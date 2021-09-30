
public class Tableau {
	

	public void initialiseLeTableau() {
	//paramètres du plateau
	int lig = 7;
	int col = 8;
	int plateau[][]= new int[lig][col];
	
	
	
	for(int i = 0;i<lig;i++) {
		
		System.out.println("\n");
		for (int j = 0; j < 8; j++) {
			plateau[i][j] = 1; 
			//pour numéroter les colonnes sur ligne du bas
			for(int z = 0;z<8;z++) {
					plateau[6][z] = z ; } ;
					//affichage de test
					System.out.print(plateau[i][j] + " test  ");
					};
	} ; }

	// pour afficher le tableau après chaque coup
	public void tableauDeJeu() {
		System.out.println(" \n \n (Partie en cours)");
		for (int m=0; m<7; m++) {
			System.out.println("\n");
			for (int g=1; g<8; g++) {
				System.out.print( plateau[m][g] + "  ok   ") ;
				
			} ;
		};
		};
}