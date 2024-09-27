/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_boisson;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Inès
 */
public class TP1_guessMyNumber_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        // Demander à l'utilisateur de choisir un niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        int choixDifficulte = sc.nextInt();
        
        // Générer un nombre aléatoire entre 0 et 100
        int nombreAleatoire = generateurAleat.nextInt(101); 
        
        int tentatives = 0;
        int maxTentatives = Integer.MAX_VALUE; // Valeur par défaut pour nombre de tentatives illimité
        
        // Ajuster les règles du jeu en fonction de la difficulté
        if (choixDifficulte == 1) {
            System.out.println("Vous avez choisi le mode facile. Vous recevrez des indices supplémentaires.");
        } else if (choixDifficulte == 2) {
            System.out.println("Vous avez choisi le mode normal. Bonne chance !");
        } else if (choixDifficulte == 3) {
            System.out.println("Vous avez choisi le mode difficile. Vous n'avez que 5 tentatives !");
            maxTentatives = 5; // Limiter le nombre de tentatives à 5 en mode difficile
        }

        int guess = -1; // Initialiser la variable guess

        // Boucle de jeu
        while (guess != nombreAleatoire && tentatives < maxTentatives) {
            System.out.println("Devinez un nombre entre 0 et 100 : ");
            guess = sc.nextInt();
            tentatives++;
            
            // Comparer le nombre deviné et ajuster les messages en fonction de la difficulté
            if (guess < nombreAleatoire) {
                if (choixDifficulte == 1 && (nombreAleatoire - guess > 20)) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (guess > nombreAleatoire) {
                if (choixDifficulte == 1 && (guess - nombreAleatoire > 20)) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné ! Vous avez trouvé le bon nombre en " + tentatives + " tentatives.");
            }

            // Si on dépasse le nombre maximum de tentatives en mode difficile
            if (tentatives == maxTentatives && guess != nombreAleatoire) {
                System.out.println("Désolé, vous avez épuisé vos " + maxTentatives + " tentatives. Le nombre était : " + nombreAleatoire);
            }
        }
    }
}