package com_package_bejegyzes_projekt;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bejegyzes b1 = new Bejegyzes("Lakatos Lajos Plébános","Sörrel a kézben");
        Bejegyzes b2 = new Bejegyzes("Galambos Gábriel","Snüsszel az arcban");

        Bejegyzesek bejegyzesList = new Bejegyzesek(new Bejegyzes[]{b1,b2});

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy darabszámot");

        //Quantity
        int db = 0;
        try{
            db = sc.nextInt();
            if (db<0){
                System.out.println("A szám nem lehet kisebb 0-nál");
            }
        }catch (Exception e){
            System.err.println("Félkész könyvet nem fogadok el");
        }
        sc.nextLine();

        //List filling
        for (int i = 0; i < db;i++){
            System.out.println("Add meg a nevedet!");
            String nev = sc.nextLine();
            System.out.println("Add meg a tratalmat!");
            String tartalom = sc.nextLine();
            Bejegyzes b3 = new Bejegyzes(nev,tartalom);
            bejegyzesList.getBejegyzesek().add(b3);
        }

        Bejegyzesek bejegyzesekLista1 = null;

        try{
            bejegyzesekLista1 = new Bejegyzesek("bejegyzesek.csv");
            bejegyzesList.getBejegyzesek().addAll(bejegyzesekLista1.getBejegyzesek());
        }catch (IOException e){
            System.err.println("Nem tudta beolvasni a fájlt");
        }

        for (int i = 0; i < bejegyzesList.getBejegyzesek().size()*20;i++){
            int bejegyzesekSzama = bejegyzesList.getBejegyzesek().size();
            int rnd = new Random().nextInt(bejegyzesekSzama-1+1)+1;
            bejegyzesList.getBejegyzesek().get(rnd-1).like();
        }


    }
}