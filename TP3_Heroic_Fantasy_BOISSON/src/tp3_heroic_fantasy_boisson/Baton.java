/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_boisson;

/**
 *
 * @author Inès
 */
public class Baton extends Arme {
    public int age;

    public Baton(int age, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        this.age = age;
    }
    
}
