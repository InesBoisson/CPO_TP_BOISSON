package tp2_bieres_boisson;

/**
 *
 * @author Inès
 */
public class BouteilleBiere {
    String nom;           // Le nom de la bière
    double degreAlcool;   // Le degré d'alcool de la bière
    String brasserie;     // Le nom de la brasserie qui la produit
    boolean ouverte;      // Indique si la bouteille est ouverte

    // Constructeur avec trois paramètres
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // La bouteille est fermée par défaut
    }

    // Méthode pour lire l'étiquette de la bière
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool +
            " degrés)\nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bière
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("Bière décapsulée.");
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;
        }
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) - Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}

