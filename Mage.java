

class Mage extends Personnage {
    public Mage(String nom) {
        super(nom, 80, 15);
    }

    @Override
    public void attaquer(Personnage cible) {
        System.out.println(nom + " lance un sort sur " + cible.getNom() + " !");
        cible.recevoirDegats(degats);
        super.gagnerExperience(22);
    }
    //les competences du personnage
    @Override
    public void utiliserCompetence(Personnage cible, int competence) {
        switch (competence) {
            case 1:
                System.out.println(nom + " utilise pluit de météores !");
                cible.recevoirDegats(degats+7);
                gagnerExperience(15);
                break;
            case 2:
                System.out.println(nom + " utilise boule de feu !");
                cible.recevoirDegats(degats +8);
                gagnerExperience(26);
                break;
            case 3:
                System.out.println(nom + " utilise tempéte magique !");
                cible.recevoirDegats(degats + 10);
                gagnerExperience(32);
                break;
            case 4:
            	if(niveau>=2) {
            	System.out.println(nom+"utilise eclair foudroyant !");
            	cible.recevoirDegats(degats *2);
            	gagnerExperience(43);
            	}else {
                    System.out.println(nom + " ne connaît pas cette compétence !");
                }
            	break;
            case 5:
            	if(niveau>=3) {
            	System.out.println(nom+" utilise explosion cosmique !");
            	cible.recevoirDegats(degats * 2.5);
            	gagnerExperience(48);
            	}else {
                    System.out.println(nom + " ne connaît pas cette compétence !");
                }
            	break;	
            default:
                System.out.println(nom + " ne connaît pas cette compétence !");
        }
        }

}
