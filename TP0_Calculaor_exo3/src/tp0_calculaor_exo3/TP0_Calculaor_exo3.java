/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculaor_exo3;

import java.util.Scanner;

/**
 *
 * @author Inès
 */
public class TP0_Calculaor_exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Please enter the operator:");
    System.out.println("1) add");
    System.out.println("2)substract");
    System.out.println("3) multiply");
    System.out.println("4) divide");
    System.out.println("5) modulo");
    int operateur;
    double result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choisissez une de ces operations :");
    operateur=sc.nextInt();
    System.out.println("entrez une premiere valeur");
    double operande1=sc.nextDouble();
    System.out.println("entres une 2e valeur");
    double operande2=sc.nextDouble();
    if (operateur==1){
        result= operande1+operande2;
        System.out.println("resultat : "+result);
    }
    else if (operateur==2) {
        result= operande1-operande2;
        System.out.println("resultat : "+result);
    }
    else if(operateur==3) {
        result= operande1*operande2;
        System.out.println("resultat : "+result);
    }
    else if (operateur==4) {
        result=operande1/operande2;
        System.out.println("resultat : "+result);    
    }
    else if (operateur==5) {
        result=operande1%operande2;
        System.out.println("resultat : "+result);
    }
    else {
        System.out.println("mettez qqc entre 1 et 5");
    }
    
    }

    private static class enter {

        public enter() {
        }
    }
    
}
