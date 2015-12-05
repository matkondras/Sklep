package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cena (od 100 do 10 00). ");
        Scanner wpiszcena = new Scanner(System.in);
        int cena = Integer.parseInt(wpiszcena.nextLine());
        System.out.println("Raty od 6 do 48");
        Scanner scanner1 = new Scanner(System.in);
             int rata = scanner1.nextByte();
        double a = 2.5 / 100;
        double b = 5.0 / 100;
        double c = 10.0 / 100;
                double Cena1 = cena + (cena * a);
                double Kwota1 = Cena1 / rata;
                double Cena2 = cena + (cena * b);
                double Kwota2 = Cena2 / rata;
                double Cena3 = cena + (cena * c);
                double Kwota3 = Cena3 / rata;
        if (rata >= 6 && rata <= 12) {
            System.out.println("Przy " + rata + " ratach. Kwota do splaty " + Cena1 + " zl,");
            System.out.println("kwota na rate " + Kwota1 + " zl.");
        } else if (13 <= rata && rata <= 24) {
            System.out.println(" Przy " + rata + " ratach. Kwota do splaty " + Cena2 + " zl,");
            System.out.println("kwota na rate " + Kwota2 + " zl.");
        } else if (25 <= rata && rata <= 48) {
            System.out.println("Przy " + rata + " ratach .Kwota do splaty " + Cena3 + " zl,");
            System.out.println(" kwota na rate " + Kwota3 + " zl.");
        } else
            System.out.println("Nie dotyczy");


    }


}
