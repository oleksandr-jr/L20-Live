package org.javarush.oleksandr.enumExample;

public enum PlanetType {
    TERRESTRIAL, GAS_GIANT, DWARF;

    public static PlanetType getType(Planet planet){
        return switch (planet) {
            case PLUTO, CERES, HAUMEA, MAKEMAKE, ERIS -> DWARF;
            case JUPITER, SATURN, URANUS, NEPTUNE -> GAS_GIANT;
            case MERCURY, VENUS, EARTH, MARS -> TERRESTRIAL;
        };
    }
}
