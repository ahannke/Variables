package it.morfoza.java101;

public class Conditionals {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean result = 1 < 2;

        int wiek = 20;

        boolean jestWGimbazie = wiek >= 13 && wiek <= 16;
        if (jestWGimbazie) {
            System.out.println("Hurra");
        }

        boolean nieJestWGimbazie = wiek < 13 || wiek > 16;
        if (nieJestWGimbazie) {
            System.out.println(nieJestWGimbazie);
        }

        nieJestWGimbazie = ! jestWGimbazie;

        boolean liceum = wiek > 16 && wiek < 20;
        if (jestWGimbazie) {
            System.out.println("liceum");
        }

        boolean nieLiceum = wiek <= 16 || wiek >= 20;
        if (nieLiceum) {
            System.out.println("spadaj");
        }



            if (result=true) {
            System.out.println("b1 is true");
        } else {
            System.out.println("b1 is false");
        }
        if (b2) {
            System.out.println("b2 is true");
        } else {
            System.out.println("b2 is false");

        }

        if (b2==true) {
            System.out.println("b2 is true");
        } else {
            System.out.println("b2 is false");

        }
    }
}