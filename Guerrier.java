

class Guerrier extends Personnage {
	
    public Guerrier(String nom) {
        super(nom, 100, 10);
    }
    //les competences du personnage
    @Override
    public void attaquer(Personnage cible) {
        System.out.println(nom + " attaque " + cible.getNom() + " !");
        cible.recevoirDegats(degats);
        super.gagnerExperience(18);
    }
    public void utiliserCompetence(Personnage cible, int competence) {
        switch (competence) {
            case 1:
                System.out.println(nom + " ulitise Lance!");
                cible.recevoirDegats(degats + 12);
                gagnerExperience(15);
                break;
            case 2:
                System.out.println(nom + " utilise Coup de rage !");
                cible.recevoirDegats(degats * 2);
                gagnerExperience(25);
                break;
            case 3:
                System.out.println(nom + " utilise charge puissante !");
                cible.recevoirDegats(degats + 13);
                gagnerExperience(33);
                break;
            case 4:
            	if(niveau>=2) {
            	System.out.println(nom+" utilise hache !");
            	cible.recevoirDegats(degats + 15);
            	gagnerExperience(40);
            	}else {
                    System.out.println(nom + " ne connaît pas cette compétence !");
                }
            	break;
            case 5:
            	if(niveau>=3) {
            	System.out.println(nom+" utilise Marteau !");
            	cible.recevoirDegats(degats * 3);
            	gagnerExperience(50);
            	}else {
                    System.out.println(nom + "  ne connaît pas cette compétence !");
                }
            	break;	
            default:
                System.out.println(nom + " ne connaît pas cette compétence !");
        }
    }

    
}
