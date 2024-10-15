/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_boisson;

/**
 *
 * @author Inès
 */
public class BouteilleBiere {
    String nom;           // Le nom de la bière
    float degreAlcool;    // Le degré d'alcool de la bière
    String brasserie;     // Le nom de la brasserie qui la produit
    boolean ouverte; 
 public void lireEtiquette() {
 System.out.println("Bouteille de " + nom +" (" + degreAlcool +
  " degres) \nBrasserie : " + brasserie ) ;

}   
}
