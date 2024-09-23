/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_boisson;

import java.util.Scanner;

/**
 *
 * @author Inès
 */
public class TP1_convertisseur_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    double varC=sc.nextDouble();
    System.out.println("La variable est "+varC);
    double varK = 0.0;
    varK = varC+273.15;
    System.out.println("La temperature en K est "+varK);
    
    
    }
    public static double CelciusVersKelvin (double tCelcius) {
     return tCelcius+273.15 ;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        return tKelvin-773.15;
}
    public static double FarenheitVersCelcius (double tFarenheit) {
        return (tFarenheit-32)*5/9;
                
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        return (tCelcius *9/5)+32;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        return (tKelvin - 273.15)*9/5 - 32;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        return (tFarenheit -32)*5/9 +273.15;
    }
    
    
}
