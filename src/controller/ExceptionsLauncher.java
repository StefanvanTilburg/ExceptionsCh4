package controller;

import model.Vierkant;

import java.util.Scanner;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 8.2 Exceptions
 * <p>
 * Doel     Gebruik exception handling om gebruiker invoer te controleren
 */
public class ExceptionsLauncher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de zijde voor het vierkant op : ");
        double zijde = keyboard.nextDouble();
        Vierkant vierkant = new Vierkant(zijde);
        System.out.printf("Oppervlakte van vierkant is : %f\n", vierkant.getOppervlakte());

        System.out.print("Geef een oppervlakte op : ");
        double oppervlakte = keyboard.nextDouble();
        System.out.printf("Zijde van vierkant is : %f\n", Vierkant.berekenZijde(oppervlakte));
    }
}
