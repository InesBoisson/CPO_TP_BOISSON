/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_boisson;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Inès
 */
public class TP1_stats_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Créer un scanner pour lire l'entrée de l'utilisateur
        Scanner sc = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.println("Saisissez un nombre entier pour le nombre de lancers : ");
        int m = sc.nextInt();  // Lire le nombre de lancers
        
        // Créer un tableau de 6 entiers pour stocker les résultats (de 0 à 5)
        int[] resultats = new int[6];  // Les cases sont initialisées à 0 par défaut
        
        // Créer un générateur de nombres aléatoires
        Random generateurAleat = new Random();
        
        // Boucle de m itérations pour tirer un nombre aléatoire
        for (int i = 0; i < m; i++) {
            int lancer = generateurAleat.nextInt(6);  // Génère un nombre entre 0 et 5
            resultats[lancer]++;  // Incrémenter la case correspondante au résultat
        }
        
        // Afficher les résultats en pourcentages
        System.out.println("Distribution des lancers apres " + m + " lancers (en pourcentage) :");
        for (int i = 0; i < resultats.length; i++) {
            double pourcentage = ((double) resultats[i] / m) * 100;  // Calculer le pourcentage
            System.out.printf("Face %d : %.2f%%\n", i, pourcentage);  // Afficher avec 2 décimales
        }
        
       
    }
}
