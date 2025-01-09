
class Voleur extends Personnage {
    public Voleur(String nom) {
        super(nom, 70, 12);
    }

    @Override
    public void attaquer(Personnage cible) {
        System.out.println(nom + " attaque furtivement " + cible.getNom() + " !");
        super.recevoirDegats(degats);
        // Chance d'une attaque critique
        if (Math.random() < 0.2) {
            System.out.println(nom + " inflige un coup critique !");
            cible.recevoirDegats(degats);
        }
        cible.gagnerExperience(20);
    }
    //les competences du personnage
    @Override
    public void utiliserCompetence(Personnage cible, int competence) {
        switch (competence) {
            case 1:
            	System.out.println(nom + " utilise poignard");
            	cible.recevoirDegats(degats+14);
                gagnerExperience(18);
                break;
            case 2:
                System.out.println(nom + " utilise attaque rapide !");
                cible.recevoirDegats(degats + 13);
                gagnerExperience(28);
                break;
            case 3:
                System.out.println(nom + " utilise frappe furtive !");
                cible.recevoirDegats(degats * 2);
                gagnerExperience(35);
                break;
            case 4:
            	if(niveau>=2) {
            	System.out.println(nom+" utilise Lance de couteau !");
            	cible.recevoirDegats(degats + 20);
            	gagnerExperience(46);
            	}else {
                    System.out.println(nom + " ne connaît pas cette compétence !");
                }
            	break;
            case 5:
            	if(niveau>=3) {
            	System.out.println(nom+" utilise pistolet !");
            	cible.recevoirDegats(degats + 28);
            	gagnerExperience(55);
            	}else {
                    System.out.println(nom + " ne connaît pas cette compétence !");
                }
            	break;	
            default:
                System.out.println(nom + " ne connaît pas cette compétence !");
        }
    }


}
