/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_boisson;

/**
 *
 * @author Inès
 */
public class Voiture {
    public String modele;
    public String marque;
    public int puissanceCV;
    public Personne proprietaire;

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;
    }
    public String toString() {
        return "Voiture [Modele :" + modele + ", Marque :" + marque + ", PuissanceCV :" + puissanceCV + "]";
    }
    
}
