
public class Tableau {
	
	//paramètres du plateau
	int lig = 7;
	int col = 8;
	int[][] plateau ; 
	plateau= new int[7][8];
	

	for(int i = 0;i<lig;i++) {
		System.out.println("\n");
		for (int j = 0; j < col; j++) {
			plateau[i][j] = 1;
			System.out.print(plateau[i][j] + "     ");
		};
	}

	for(int i = 0;i<7;i++) {
		plateau[6][i] = i;
	};

	//pour afficher le plateau de jeu
	public void tableauDeJeu() {
		for (int i=0; i<7; i++) {
			System.out.println("\n");
			for (int j=0; j<8; j++) {
				System.out.print( plateau[i][j]+"     ");
			} ;
		};
		};
}