package mya2;

import java.util.Scanner;

public class Coffe {

    public static void main(String arg[]){

        //1. Ask user season of the year
        System.out.println("Cual es la estacion del año?.");
        Scanner scanner = new Scanner(System.in);
        String estacion = scanner.next();

        //2. Input a whole number
        System.out.println("Cuantas tazas de cafe toma?");;
        int tazas = scanner.nextInt();


        //3. Input an adjective
        System.out.println("Entre un abjetivo.");;
        String adbjetivo = scanner.next();
        scanner.close();

        System.out.println("En una " + adbjetivo + " " + "noche de " + estacion + " " +   "Tomo unas " +  tazas + " " +  "de cafe" );
    }
}
