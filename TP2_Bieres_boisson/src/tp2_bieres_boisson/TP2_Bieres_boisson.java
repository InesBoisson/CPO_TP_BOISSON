/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_boisson;

/**
 *
 * @author Inès
 */
public class TP2_Bieres_boisson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de plusieurs objets de type BouteilleBiere
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Guinness", 4.2, "Guinness Brewery");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Duvel", 8.5, "Duvel Moortgat Brewery");

        // Décapsuler quelques bières
        uneBiere.decapsuler();        // Décapsule la première bière
        troisiemeBiere.decapsuler();  // Décapsule la troisième bière

        // Affichage des bières
        System.out.println(uneBiere);        // Affiche l'état de la première bière
        System.out.println(deuxiemeBiere);   // Affiche l'état de la deuxième bière (non décapsulée)
        System.out.println(troisiemeBiere);  // Affiche l'état de la troisième bière
        System.out.println(quatriemeBiere);  // Affiche l'état de la quatrième bière (non décapsulée)
    }
}

