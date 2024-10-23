/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_boisson;

/**
 *
 * @author Inès
 */
import java.util.Scanner;
public class TP2_convertisseurObjet_Boisson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Création de deux objets Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        // Effectuer quelques conversions avec le premier convertisseur
        System.out.println("Premier convertisseur :");
        System.out.println("25°C vers Kelvin : " + convertisseur1.CelciusVersKelvin(25));
        System.out.println("300K vers Celsius : " + convertisseur1.KelvinVersCelcius(300));
        
        // Effectuer quelques conversions avec le second convertisseur
        System.out.println("Second convertisseur :");
        System.out.println("32°F vers Celsius : " + convertisseur2.FarenheitVersCelcius(32));
        System.out.println("0°C vers Fahrenheit : " + convertisseur2.CelciusVersFarenheit(0));

        // Afficher le nombre de conversions effectuées par chaque objet
        System.out.println(convertisseur1);
        System.out.println(convertisseur2);

        // Menu interactif
        afficherMenu(convertisseur1);
    }

    // Méthode pour afficher un menu et interagir avec l'utilisateur
    public static void afficherMenu(Convertisseur convertisseur) {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu des conversions :");
            System.out.println("1 - Convertir Celsius vers Kelvin");
            System.out.println("2 - Convertir Kelvin vers Celsius");
            System.out.println("3 - Convertir Fahrenheit vers Celsius");
            System.out.println("4 - Convertir Celsius vers Fahrenheit");
            System.out.println("5 - Convertir Fahrenheit vers Kelvin");
            System.out.println("6 - Convertir Kelvin vers Fahrenheit");
            System.out.println("7 - Quitter");
            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();

            float temperature, resultat;

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.CelciusVersKelvin(temperature);
                    System.out.println("Résultat : " + temperature + " °C = " + resultat + " K");
                    break;

                case 2:
                    System.out.print("Entrez la température en Kelvin : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.KelvinVersCelcius(temperature);
                    System.out.println("Résultat : " + temperature + " K = " + resultat + " °C");
                    break;

                case 3:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.FarenheitVersCelcius(temperature);
                    System.out.println("Résultat : " + temperature + " °F = " + resultat + " °C");
                    break;

                case 4:
                    System.out.print("Entrez la température en Celsius : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.CelciusVersFarenheit(temperature);
                    System.out.println("Résultat : " + temperature + " °C = " + resultat + " °F");
                    break;

                case 5:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.FarenheitVersKelvin(temperature);
                    System.out.println("Résultat : " + temperature + " °F = " + resultat + " K");
                    break;

                case 6:
                    System.out.print("Entrez la température en Kelvin : ");
                    temperature = sc.nextFloat();
                    resultat = convertisseur.KelvinVersFarenheit(temperature);
                    System.out.println("Résultat : " + temperature + " K = " + resultat + " °F");
                    break;

                case 7:
                    System.out.println("Merci d'avoir utilisé le convertisseur. Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }

        } while (choix != 7);

        // Fermeture du scanner
        sc.close();
    }
}
