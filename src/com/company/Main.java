package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Rasya";
        names[1] = "Aibek";
        names[2] = "Ulan";

        for (int i = 0; i < 3; i++) {
            switch (names[i]) {
                case "Rasya":
                    System.out.println("Hello" + " " + names[i]);
                    System.out.println(names[0] + " "+  "Good morning");
                    break;
                case "Aibek":
                    System.out.println("Hello" + " " + names[i]);
                    System.out.println(names[1] + " " + "Good afternoon");
                    break;
                case "Ulan":
                    System.out.println("Hello" + " " + names[i]);
                    System.out.println( names[2] + " " + "Good evening");





            }
        }
    }
}