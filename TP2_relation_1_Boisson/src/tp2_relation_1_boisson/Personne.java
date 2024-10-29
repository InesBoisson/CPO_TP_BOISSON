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
    
}
