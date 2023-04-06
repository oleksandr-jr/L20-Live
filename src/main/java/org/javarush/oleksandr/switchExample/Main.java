package org.javarush.oleksandr.switchExample;

public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 6;


        String typeOfDay = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Робочий день";
            case 6, 7 -> "вихідний";
            default -> "Немає такого дня в тижні";
        };

        System.out.println(typeOfDay);

    }
}
