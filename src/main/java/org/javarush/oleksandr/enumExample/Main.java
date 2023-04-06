package org.javarush.oleksandr.enumExample;

public class Main {
    public static void main(String[] args) {
        Planet myPlanet = Planet.ERIS;

        System.out.println(PlanetType.getType(myPlanet));
    }
}