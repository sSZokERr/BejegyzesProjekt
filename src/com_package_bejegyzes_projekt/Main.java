package com_package_bejegyzes_projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bejegyzes b1 = new Bejegyzes("Lakatos Lajos Plébános","Sörrel a kézben");
        Bejegyzes b2 = new Bejegyzes("Galambos Gábriel","Snüsszel az arcban");

        Bejegyzesek bejegyzesList = new Bejegyzesek(new Bejegyzes[]{b1,b2});

        Scanner sc = new Scanner(System.in);
    }
}