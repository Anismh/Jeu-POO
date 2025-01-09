import java.util.Scanner;

public class Play01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création des personnages
        Personnage guerrier = new Guerrier("Thor");
        Personnage mage = new Mage("Floki");
        Personnage voleur = new Voleur("Loki");

        // Choix du personnage par le joueur
        System.out.println("Choisissez votre personnage :");
        System.out.println("1. Guerrier (Thor)");
        System.out.println("2. Mage (Floki)");
        System.out.println("3. Voleur (Loki)");

        int choix = scanner.nextInt();
        Personnage joueur;
        switch (choix) {
            case 1:
                joueur = guerrier;
                break;
            case 2:
                joueur = mage;
                break;
            case 3:
                joueur = voleur;
                break;
            default:
                System.out.println("Choix invalide. Le Guerrier (Thor) est sélectionné par défaut.");
                joueur = guerrier;
        }

        // Choix de l'adversaire
        System.out.println("Choisissez votre adversaire :");
        if (joueur != guerrier) System.out.println("1. Thor");
        if (joueur != mage) System.out.println("2. Floki");
        if (joueur != voleur) System.out.println("3. Loki");

        int adversaireChoix = scanner.nextInt();
        Personnage adversaire = null;

        if (adversaireChoix == 1 && joueur != guerrier) adversaire = guerrier;
        if (adversaireChoix == 2 && joueur != mage) adversaire = mage;
        if (adversaireChoix == 3 && joueur != voleur) adversaire = voleur;

        if (adversaire == null) {
            System.out.println("Adversaire invalide. Le combat ne peut pas commencer.");
            return;
        }

        // Boucle de combat
        while (joueur.estVivant() && adversaire.estVivant()) {
            System.out.println("\n--- Tour de combat ---");
            System.out.println("1. Attaquer l'adversaire");
            System.out.println("2. Utiliser compétence spéciale");
            System.out.println("3. Passer son tour");

            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    joueur.attaquer(adversaire);
                    break;
                case 2:
                    System.out.println("Choisissez une compétence :");
                    if (joueur instanceof Mage) {
                        System.out.println("1. Pluie de météores");
                        System.out.println("2. Boule de feu");
                        System.out.println("3. Tempête magique");
                    } else if (joueur instanceof Guerrier) {
                        System.out.println("1. Lance");
                        System.out.println("2. Coup de rage");
                        System.out.println("3. Charge puissante");
                    } else if (joueur instanceof Voleur) {
                        System.out.println("1. Poignard");
                        System.out.println("2. Attaque rapide");
                        System.out.println("3. Frappe furtive");
                    }
                    int competence = scanner.nextInt();
                    joueur.utiliserCompetence(adversaire, competence);
                    break;
                case 3:
                    System.out.println(joueur.getNom() + " passe son tour.");
                    break;
                default:
                    System.out.println("Action invalide.");
            }

            if (adversaire.estVivant()) {
                adversaire.attaquer(joueur);
            }

            if (!joueur.estVivant()) {
                System.out.println(joueur.getNom() + " est vaincu !");
            }
            if (!adversaire.estVivant()) {
                System.out.println(adversaire.getNom() + " est vaincu !");
            }
        }

        scanner.close();
        System.out.println("Le combat est terminé !");
    }
}
