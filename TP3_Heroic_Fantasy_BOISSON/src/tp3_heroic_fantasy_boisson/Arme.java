package tp3_heroic_fantasy_boisson;

// Classe abstraite Arme
public abstract class Arme {
    // Attributs privés
    private String nom;
    private int niveauAttaque;

    // Constructeur de la classe Arme pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // Assurer que le niveau d'attaque est <= 100
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            this.niveauAttaque = 100; // Si le niveau est supérieur à 100, on le limite à 100
        }
    }

    // Getter pour le nom de l'arme
    public String getNom() {
        return this.nom;
    }

    // Getter pour le niveau d'attaque de l'arme
    public int getNiveauAttaque() {
        return this.niveauAttaque;
    }

    // Méthode toString pour afficher le nom et le niveau d'attaque de l'arme
    @Override
    public String toString() {
        return "Nom de l'arme : " + this.nom + ", Niveau d'attaque : " + this.niveauAttaque;
    }
}
