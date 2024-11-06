/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_boisson;

/**
 *
 * @author Inès
 */
public class Personne {
    public String nom;
    public String prenom;
    public int nbVoitures;
    public Voiture[] liste_voitures;
    
    public Personne (String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.nbVoitures = 0;
        liste_voitures = new Voiture [3] ;
    }

    @Override
    public String toString() {
        return "Personne [nom :" + nom + ", prenom :" + prenom +"]";
    }
 public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
    // Vérifier si la voiture a déjà un propriétaire
    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("Erreur : La voiture appartient deja a " + voiture_a_ajouter.proprietaire.nom + ".");
        return false;
    }

    // Vérifier si le tableau est plein
    if (nbVoitures >= liste_voitures.length) {
        System.out.println("Erreur : La liste des voitures est pleine pour " + prenom + ".");
        return false;
    }

    // Ajout de la voiture
    liste_voitures[nbVoitures] = voiture_a_ajouter;
    voiture_a_ajouter.proprietaire = this; // Définir le propriétaire de la voiture
    nbVoitures++; // Incrémenter le nombre de voitures

    System.out.println("Voiture ajoutee avec succes pour " + prenom + ".");
    return true;
 }

}
