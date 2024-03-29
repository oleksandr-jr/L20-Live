package org.javarush.oleksandr.enumExample;


public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7),

    //Dwarf planets
    PLUTO(1.309e+22, 1.1883e6),
    CERES(9.3835e+20, 4.73e5),
    HAUMEA(4.006e+21, 1.163e6),
    MAKEMAKE(3.0e+21, 7.93e5),
    ERIS(1.6466e+22, 1.163e6);

    private final double mass;

    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static Planet getBestPlanet(){
        return EARTH;
    }

    public static Planet findLargestPlanet() {
        Planet[] planets = Planet.values();
        Planet largestPlanet = planets[0];
        for (int i = 1; i < planets.length; i++) {
            if (planets[i].getRadius() > largestPlanet.getRadius()) {
                largestPlanet = planets[i];
            }
        }
        return largestPlanet;
    }

}