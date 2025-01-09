
 abstract class Personnage implements Attaquable {
	protected String nom;
	protected int pointsDeVie;
	protected int degats; // Dégâts de base
	protected int niveau;
	protected int experience;

	public Personnage(String nom, int pointsDeVie, int degats) {
		this.nom = nom;
		this.pointsDeVie = pointsDeVie;
		this.degats = degats;
		this.niveau = 1;
		this.experience = 0;
	}

	public void recevoirDegats(double degats) {
		pointsDeVie -= degats;
		System.out.println(nom + " a reçu " + degats + " points de dégâts. Points de vie restants : " + pointsDeVie);
	}

	public boolean estVivant() {
		return pointsDeVie > 0;
	}

	public String getNom() {
		return nom;
	}

	public void gagnerExperience(int xp) {
		experience += xp;
		if (experience >= 100) {
			niveau++;
			experience = 0;
			System.out.println(nom + " a atteint le niveau " + niveau + " Nouvelle competence debloquer!");
		
		if(niveau == 2) {
			pointsDeVie= pointsDeVie+10;
			System.out.println("Points de vie restants : "+ pointsDeVie);
		}
		if(niveau==3) {
			pointsDeVie=pointsDeVie+22;
			System.out.println("Points de vie restants : "+ pointsDeVie);
		}
		}
	}

}
