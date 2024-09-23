/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_boisson;

import java.util.Scanner;

/**
 *
 * @author Inès
 */
public class TP1_manipNombresInt_BOISSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("entrez une premiere variable");
    int var1 = sc.nextInt();
    System.out.println("entrez une 2e variabe");
    int var2 = sc.nextInt();
    System.out.println("vos variables sont "+var1+" et "+var2);
    int somme;
    int difference;
    int produit;
    somme = var1+var2;
    System.out.println("la somme est "+somme);
    difference= var1-var2;
    System.out.println("la difference est "+difference);
    produit=var1*var2;
    System.out.println("le produit est "+produit);
    int quotient;
    quotient=var1/var2; // diviesion euclidienne
    int reste;
    reste=var1%var2;
    System.out.println("le qutient est "+quotient+" et le rest est "+reste);
    
    
    
    }
    
}
