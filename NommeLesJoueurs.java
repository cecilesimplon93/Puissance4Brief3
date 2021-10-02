public class NommeLesJoueurs {

	public void player1() {
		System.out.println("Joueur 1, quel est ton nom ?");

	}

	public void player2() {
		System.out.println("Joueur 2, quel est ton nom ?");
	}

	//passer le nom du joueur en param�tre
	public void welcome(String nomJoueur) {
		System.out.println("Bienvenue à toi, " + nomJoueur+" !");
	}

}