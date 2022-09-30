package com_package_bejegyzes_projekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bejegyzesek {
    private List<Bejegyzes> bejegyzesek;

    public Bejegyzesek(Bejegyzes[] bejegyzesTomb){
        this.bejegyzesek = new ArrayList<>();
        this.bejegyzesek.addAll(Arrays.asList(bejegyzesTomb));
    }
}
