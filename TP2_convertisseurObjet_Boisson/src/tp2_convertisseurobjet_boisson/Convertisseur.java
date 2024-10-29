/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_boisson;

/**
 *
 * @author Inès
 */
public class Convertisseur {

    // Attribut pour compter le nombre de conversions
    private int nbConversions;
    // Constructeur sans paramètre qui initialise nbConversions à 0
    public Convertisseur() {
        nbConversions = 0;
    }
    // Méthode pour convertir Celsius en Kelvin
    public float CelciusVersKelvin(float tempCelsius) {
        nbConversions++; // Incrémente le nombre de conversions
        return tempCelsius + 273.15f;
    }
    // Méthode pour convertir Kelvin en Celsius
    public float KelvinVersCelcius(float tempKelvin) {
        nbConversions++; // Incrémente le nombre de conversions
        return tempKelvin - 273.15f;
    }
    // Méthode pour convertir Fahrenheit en Celsius
    public float FarenheitVersCelcius(float tempFahrenheit) {
        nbConversions++; // Incrémente le nombre de conversions
        return (tempFahrenheit - 32) * 5 / 9;
    }
    // Méthode pour convertir Celsius en Fahrenheit
    public float CelciusVersFarenheit(float tempCelsius) {
        nbConversions++; // Incrémente le nombre de conversions
        return (tempCelsius * 9 / 5) + 32;
    }
    // Méthode pour convertir Fahrenheit en Kelvin
    public float FarenheitVersKelvin(float tempFahrenheit) {
        nbConversions++; // Incrémente le nombre de conversions
        return CelciusVersKelvin(FarenheitVersCelcius(tempFahrenheit));
    }
    // Méthode pour convertir Kelvin en Fahrenheit
    public float KelvinVersFarenheit(float tempKelvin) {
        nbConversions++; // Incrémente le nombre de conversions
        return CelciusVersFarenheit(KelvinVersCelcius(tempKelvin));
    }
    // Redéfinition de la méthode toString() pour afficher le nombre de conversions effectuées
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
}
    
